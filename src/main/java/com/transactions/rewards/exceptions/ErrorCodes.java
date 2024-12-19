package com.transactions.rewards.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCodes {
    CUSTOMER_NOT_FOUND("Customer not found for id: %s");

    private final String message;
}
