package com.transactions.rewards.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionRewardResponse {
    private String customerId;
    private String name;
    private Integer totalRewards;
    private Map<String, Integer> monthlyRewards;
}
