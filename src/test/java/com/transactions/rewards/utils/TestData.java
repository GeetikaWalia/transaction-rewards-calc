package com.transactions.rewards.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.model.response.TransactionRewardResponse;
import org.bson.types.ObjectId;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class TestData {
    public static List<TransactionRewardResponse> rewardsResponse() throws IOException {
        return List.of(new ObjectMapper().readValue(TestData.class.getClassLoader().getResourceAsStream("response/rewardResponse.json"), TransactionRewardResponse[].class));
    }

    public static Customer customer(String name, String email) {
        return new Customer(new ObjectId(), name, email);
    }

    public static Transaction transaction(Customer customer, LocalDate date, Integer amount) {
        return new Transaction(customer, date, amount);
    }
}
