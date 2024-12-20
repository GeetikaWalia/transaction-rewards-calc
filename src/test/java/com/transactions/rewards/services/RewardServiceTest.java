package com.transactions.rewards.services;

import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.model.response.TransactionRewardResponse;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static com.transactions.rewards.utils.TestData.customer;
import static com.transactions.rewards.utils.TestData.transaction;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class RewardServiceTest {

    @Mock
    private TransactionService transactionService;

    @Mock
    private CustomerService customerService;

    @InjectMocks
    private RewardService rewardService;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    @DisplayName("calculateRewards should calculate rewards correctly")
    void calculateRewardsShouldCalculateRewardsCorrectly() {
        Customer customerOne = customer("Customer One", "customerone@test.com");
        Customer customerTwo = customer("Customer Two", "customertwo@test.com");

        List<Transaction> transactions = List.of(
                transaction(customerOne, LocalDate.of(2024, 1, 15), 120),
                transaction(customerOne, LocalDate.of(2024, 2, 10), 85),
                transaction(customerOne, LocalDate.of(2024, 3, 5), 75),
                transaction(customerTwo, LocalDate.of(2024, 1, 18), 95),
                transaction(customerTwo, LocalDate.of(2024, 3, 25), 200)
        );

        when(transactionService.findAllTransactions()).thenReturn(transactions);

        Map<ObjectId, Customer> customerMap = Map.of(
                customerOne.getId(), customerOne,
                customerTwo.getId(), customerTwo
        );
        when(customerService.findAllByCustomerId(customerMap.keySet())).thenReturn(customerMap);

        List<TransactionRewardResponse> rewards = rewardService.calculateRewards();

        assertThat(rewards).hasSize(2);
    }

    @Test
    @DisplayName("calculateRewards should return empty")
    void calculateRewardsShouldReturnEmpty() {
        when(transactionService.findAllTransactions()).thenReturn(List.of());

        List<TransactionRewardResponse> rewards = rewardService.calculateRewards();

        assertThat(rewards).hasSize(0);
    }
}
