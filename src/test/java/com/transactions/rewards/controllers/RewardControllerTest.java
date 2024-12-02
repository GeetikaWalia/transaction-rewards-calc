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
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        Customer customerOne = customerRepository.save(new Customer(null, "Customer One", "customerone@test.com"));
        Customer customerTwo = customerRepository.save(new Customer(null, "Customer Two", "customertwo@test.com"));

        transactionRepository.saveAll(List.of(
                new Transaction(customerOne, LocalDate.of(2024, 1, 15), 120),
                new Transaction(customerOne, LocalDate.of(2024, 2, 10), 85),
                new Transaction(customerOne, LocalDate.of(2024, 3, 5), 75),
                new Transaction(customerTwo, LocalDate.of(2024, 1, 18), 95),
                new Transaction(customerTwo, LocalDate.of(2024, 3, 25), 200)
        ));

    }

    @Test
    @SneakyThrows
    @DisplayName("getRewards should return reward details from database")
    void getRewardsShouldReturnRewardDetailsFromDatabase() {
        var expectedResponse = List.of(
                TransactionRewardResponse.builder().totalRewards(150).monthlyRewards(Map.of("JANUARY", 90, "MARCH", 25, "FEBRUARY", 35)).name("Customer One").build(),
                TransactionRewardResponse.builder().totalRewards(295).monthlyRewards(Map.of("JANUARY", 45, "MARCH", 250)).name("Customer Two").build());

        String contentAsString = mockMvc.perform(get("/api/rewards")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn().getResponse().getContentAsString();

        var actualResponse = objectMapper.readValue(contentAsString, TransactionRewardResponse[].class);

        assertEquals(actualResponse.length, 2);
    }
}