package com.transactions.rewards.controllers;

import com.transactions.rewards.model.response.TransactionRewardResponse;
import com.transactions.rewards.services.RewardService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rewards")
@Tag(name = "Rewards", description = "Endpoints for reward calculation")
public class RewardController {

    @Autowired
    private RewardService rewardService;

    @Operation(summary = "Get rewards for customers",
            description = "Retrieve monthly and total rewards for customers.")
    @GetMapping
    public ResponseEntity<List<TransactionRewardResponse>> getRewards() {
        return ResponseEntity.ok(rewardService.calculateRewards());
    }
}
