package com.transactions.rewards.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class RewardUtils {
    public static int calculateRewardPoints(double amount) {
        int points = 0;
        if (amount > 100) {
            points += (amount - 100) * 2;
            amount = 100;
        }
        if (amount > 50) {
            points += (amount - 50);
        }
        return points;
    }
}
