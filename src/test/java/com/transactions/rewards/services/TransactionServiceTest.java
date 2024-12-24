package com.transactions.rewards.services;

import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.repository.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.List;

import static com.transactions.rewards.utils.TestData.customer;
import static com.transactions.rewards.utils.TestData.transaction;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @InjectMocks
    private TransactionService transactionService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("findAllTransactions should return transactions list")
    void findAllTransactionsShouldReturnTransactions() {
        Customer customerOne = customer("Customer One", "customerone@test.com");
        Customer customerTwo = customer("Customer Two", "customertwo@test.com");

        LocalDate date = LocalDate.now();
        List<Transaction> transactions = List.of(
                transaction(customerOne, date.minusMonths(1), 120),
                transaction(customerOne, date.minusMonths(2), 85),
                transaction(customerTwo, date.minusMonths(1), 95),
                transaction(customerTwo, date.minusMonths(2), 200)
        );

        when(transactionRepository.findByDateBetweenOrderByDateDesc(any(), any())).thenReturn(transactions);

        List<Transaction> result = transactionService.findAllTransactionsForLast3Months();

        assertNotNull(result);
        assertEquals(4, result.size());
        assertEquals(transactions, result);
    }

    @Test
    @DisplayName("findAllTransactions should return empty list")
    void findAllTransactionsShouldReturnEmptyList() {
        when(transactionRepository.findAll()).thenReturn(List.of());

        List<Transaction> result = transactionService.findAllTransactionsForLast3Months();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}