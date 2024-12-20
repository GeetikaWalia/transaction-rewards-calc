package com.transactions.rewards.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transactions.rewards.model.dto.CustomerDto;
import com.transactions.rewards.model.dto.TransactionDto;
import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.repository.CustomerRepository;
import com.transactions.rewards.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@Slf4j
@Profile("!test")
public class DataSeeder implements CommandLineRunner {

    private final TransactionRepository transactionRepository;
    private final CustomerRepository customerRepository;
    private final ObjectMapper objectMapper;

    @SneakyThrows
    @Override
    public void run(String... args) {
        transactionRepository.deleteAll();
        customerRepository.deleteAll();
        try (InputStream customerStream = this.getClass().getClassLoader().getResourceAsStream("data/customers.json");
             InputStream transactionStream = this.getClass().getClassLoader().getResourceAsStream("data/transactions.json")) {
            var customerDtos = objectMapper.readValue(customerStream, CustomerDto[].class);
            var transactionDtos = objectMapper.readValue(transactionStream, TransactionDto[].class);

            Map<String, List<TransactionDto>> customerTransactionMap = Arrays.stream(transactionDtos)
                    .collect(Collectors.groupingBy(TransactionDto::getCustomerId, Collectors.toList()));

            Arrays.asList(customerDtos).forEach(dto -> {
                log.info("Starting process for customer {}", dto.getName());
                var customer = Customer.builder().email(dto.getEmail()).name(dto.getName()).build();
                var savedCustomer = customerRepository.save(customer);

                List<Transaction> transactions = customerTransactionMap.getOrDefault(dto.getCustomerId(), new ArrayList<>())
                        .stream().map(transactionDto -> Transaction.builder()
                                .customer(savedCustomer)
                                .date(transactionDto.getDate())
                                .amount(transactionDto.getAmount()).build()).toList();
                if (!transactions.isEmpty()) {
                    transactionRepository.saveAll(transactions);
                }
                log.info("Saved transactions {} for customer {}", transactions.size(), savedCustomer.getName());
            });

            log.info("Database seeded with transaction data!");
        } catch (Exception e) {
            log.error("Error in transaction data seeding");
        }
    }
}