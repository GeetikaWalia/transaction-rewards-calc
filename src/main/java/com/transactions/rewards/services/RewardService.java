package com.transactions.rewards.services;

import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.model.response.TransactionRewardResponse;
import com.transactions.rewards.utils.RewardUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class RewardService {

    private final TransactionService transactionService;
    private final CustomerService customerService;

    public List<TransactionRewardResponse> calculateRewards() {
        List<Transaction> transactions = transactionService.findAllTransactions();

        if (CollectionUtils.isEmpty(transactions)) {
            log.info("No transactions found");
            return new ArrayList<>();
        }

        Map<ObjectId, Map<String, Integer>> rewardsByCustomer = new HashMap<>();

        transactions.forEach(transaction -> {
            String month = transaction.getDate().getMonth().toString();
            rewardsByCustomer
                    .computeIfAbsent(transaction.getCustomer().getId(), k -> new HashMap<>())
                    .merge(month, RewardUtils.calculateRewardPoints(transaction.getAmount()), Integer::sum);
        });

        var customerMap = customerService.findAllByCustomerId(rewardsByCustomer.keySet());

        return rewardsByCustomer.entrySet().stream().map(entry -> {
            var customer = customerMap.get(entry.getKey());
            if (customer == null) {
                return null;
            }
            var monthly = entry.getValue();
            var total = monthly.values().stream().mapToInt(Integer::intValue).sum();
            return TransactionRewardResponse.builder()
                    .monthlyRewards(monthly)
                    .totalRewards(total)
                    .name(customer.getName())
                    .customerId(customer.getId().toString()).build();
        }).filter(Objects::nonNull).toList();
    }
}
