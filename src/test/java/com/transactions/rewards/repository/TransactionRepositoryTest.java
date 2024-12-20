package com.transactions.rewards.repository;

import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.model.entity.Transaction;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static com.transactions.rewards.utils.TestData.customer;
import static com.transactions.rewards.utils.TestData.transaction;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class TransactionRepositoryTest {

    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    @DisplayName("findAll should work fine")
    void findAllShouldWorkFine() {
        Customer customerOne = customer("Customer One", "customerone@test.com");
        Transaction transaction = transaction(customerOne, LocalDate.of(2024, 1, 15), 120);

        transactionRepository.save(transaction);

        List<Transaction> result = transactionRepository.findAll();

        assertFalse(result.isEmpty());
        Assertions.assertThat(transaction).usingRecursiveComparison().ignoringFields("id", "customer").isEqualTo(result.get(0));
    }

    @Test
    @DisplayName("deleteById should work fine")
    void deleteByIdShouldWorkFine() {
        Customer customerOne = customer("Customer One", "customerone@test.com");
        Transaction transaction = transaction(customerOne, LocalDate.of(2024, 1, 15), 120);

        transactionRepository.save(transaction);

        transactionRepository.deleteById(transaction.getId());

        Optional<Transaction> result = transactionRepository.findById(customerOne.getId());
        assertFalse(result.isPresent());
    }
}
