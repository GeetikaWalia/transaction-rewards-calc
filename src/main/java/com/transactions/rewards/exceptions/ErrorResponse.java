package com.transactions.rewards.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse extends RuntimeException {
    private int status;
    private String message;
    private LocalDateTime timestamp;
    private String path;
}