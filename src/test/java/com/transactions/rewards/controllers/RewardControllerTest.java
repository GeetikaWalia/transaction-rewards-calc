package com.transactions.rewards.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.model.response.TransactionRewardResponse;
import com.transactions.rewards.repository.CustomerRepository;
import com.transactions.rewards.repository.TransactionRepository;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static com.transactions.rewards.utils.TestData.customer;
import static com.transactions.rewards.utils.TestData.rewardsResponse;
import static com.transactions.rewards.utils.TestData.transaction;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RewardControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TransactionRepository transactionRepository;


    @BeforeEach
    void setUp() {
        // Clean database
        transactionRepository.deleteAll();
        customerRepository.deleteAll();
        setUpData();
    }

    private void setUpData() {
        Customer customerOne = customerRepository.save(customer("Customer One", "customerone@test.com"));
        Customer customerTwo = customerRepository.save(customer("Customer Two", "customertwo@test.com"));
        List<Transaction> transactions = List.of(
                transaction(customerOne, LocalDate.of(2024, 1, 15), 120),
                transaction(customerOne, LocalDate.of(2024, 2, 10), 85),
                transaction(customerOne, LocalDate.of(2024, 3, 5), 75),
                transaction(customerTwo, LocalDate.of(2024, 1, 18), 95),
                transaction(customerTwo, LocalDate.of(2024, 3, 25), 200)
        );
        transactionRepository.saveAll(transactions);
    }

    @Test
    @SneakyThrows
    @DisplayName("getRewards should return reward details from database")
    void getRewardsShouldReturnRewardDetailsFromDatabase() {
        var expectedResponse = rewardsResponse();

        String contentAsString = mockMvc.perform(get("/api/rewards")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn().getResponse().getContentAsString();

        var actualResponse = objectMapper.readValue(contentAsString, TransactionRewardResponse[].class);

        assertEquals(2, actualResponse.length);
        for (TransactionRewardResponse rewardResponse : expectedResponse) {
            TransactionRewardResponse response = Arrays.stream(actualResponse).
                    filter(transactionRewardResponse -> transactionRewardResponse.getName().equals(rewardResponse.getName())).findFirst().orElse(null);
            assertNotNull(response);
            assertThat(response)
                    .usingRecursiveComparison().ignoringFields("customerId")
                    .isEqualTo(rewardResponse);
        }
    }
}