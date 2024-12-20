package com.transactions.rewards.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private String customerId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate date;
    private double amount;
}