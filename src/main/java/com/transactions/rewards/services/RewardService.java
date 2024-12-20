package com.transactions.rewards.services;

import com.transactions.rewards.exceptions.ErrorCodes;
import com.transactions.rewards.exceptions.RewardsException;
import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.model.response.TransactionRewardResponse;
import com.transactions.rewards.utils.RewardUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

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

        var customerMap = Optional.ofNullable(customerService.findAllByCustomerId(rewardsByCustomer.keySet()))
                .orElse(new HashMap<>());

        return rewardsByCustomer.entrySet().stream().map(entry -> {
            var customer = customerMap.get(entry.getKey());
            if (customer == null) {
                throw new RewardsException(ErrorCodes.CUSTOMER_NOT_FOUND, entry.getKey());
            }
            var monthlyRewards = entry.getValue().entrySet().stream().map(stringIntegerEntry ->
                    TransactionRewardResponse.MonthlyRewardResponse.builder()
                            .reward(stringIntegerEntry.getValue())
                            .month(Month.valueOf(stringIntegerEntry.getKey())).build()).sorted(Comparator
                    .comparing(TransactionRewardResponse.MonthlyRewardResponse::getMonth)).toList();

            var total = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            return TransactionRewardResponse.builder()
                    .monthlyRewards(monthlyRewards)
                    .totalRewards(total)
                    .name(customer.getName())
                    .customerId(customer.getId().toString()).build();
        }).filter(Objects::nonNull).toList();
    }
}
