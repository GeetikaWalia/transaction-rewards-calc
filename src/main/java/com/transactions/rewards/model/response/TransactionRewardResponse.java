package com.transactions.rewards.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Month;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionRewardResponse {
    private String customerId;
    private String name;
    private Integer totalRewards;
    private double totalAmount;
    private List<MonthlyRewardResponse> monthlyRewards;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class MonthlyRewardResponse {
        private Month month;
        private Integer reward;
        private double amount;

        public void addAmount(double amount) {
            this.amount += amount;
        }

        public void addRewardPoints(int points) {
            if (reward == null) {
                reward = 0;
            }
            reward += points;
        }
    }
}
