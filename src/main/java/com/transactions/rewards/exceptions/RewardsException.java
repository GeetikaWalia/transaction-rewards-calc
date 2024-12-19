package com.transactions.rewards.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;

import java.io.Serial;

@RequiredArgsConstructor
@Getter
public class RewardsException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    private final HttpStatus status;
    private String message;

    public RewardsException(ErrorCodes errorCode, ObjectId customerId) {
        status = HttpStatus.INTERNAL_SERVER_ERROR;
        message = String.format(errorCode.getMessage(), customerId);
    }
}
