package com.transactions.rewards.utils;

import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.model.response.TransactionRewardResponse;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.List;

public class TestData {
    public static List<TransactionRewardResponse> rewardsResponse(Customer customerOne, Customer customerTwo) {
        LocalDate date = LocalDate.now();
        return List.of(TransactionRewardResponse.builder().customerId(customerOne.getId().toString())
                        .totalRewards(125)
                        .totalAmount(205.0)
                .monthlyRewards(List.of(TransactionRewardResponse.MonthlyRewardResponse.builder()
                                .month(date.minusMonths(2).getMonth())
                                .reward(35)
                                .amount(85.0)
                                .build(),
                        TransactionRewardResponse.MonthlyRewardResponse.builder()
                                .month(date.minusMonths(1).getMonth())
                                .reward(90)
                                .amount(120.0)
                                .build()))
                .name(customerOne.getName())
                .build(),
        TransactionRewardResponse.builder().customerId(customerTwo.getId().toString())
                .totalRewards(295)
                .totalAmount(295.0)
                .monthlyRewards(List.of(TransactionRewardResponse.MonthlyRewardResponse.builder()
                                .month(date.minusMonths(2).getMonth())
                                .reward(250)
                                .amount(200.0)
                                .build(),
                        TransactionRewardResponse.MonthlyRewardResponse.builder()
                                .month(date.minusMonths(1).getMonth())
                                .reward(45)
                                .amount(95)
                                .build()))
                .name(customerTwo.getName())
                .build());
    }

    public static Customer customer(String name, String email) {
        return new Customer(new ObjectId(), name, email);
    }

    public static Transaction transaction(Customer customer, LocalDate date, Integer amount) {
        return new Transaction(customer, date, amount);
    }
}
