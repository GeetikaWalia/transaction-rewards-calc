package com.transactions.rewards.services;

import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.repository.TransactionRepository;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
        Customer customerOne = new Customer(new ObjectId(), "Customer One", "customerone@test.com");
        Customer customerTwo = new Customer(new ObjectId(), "Customer Two", "customertwo@test.com");

        List<Transaction> transactions = List.of(
                new Transaction(new ObjectId(), customerOne, LocalDate.of(2024, 1, 15), 120),
                new Transaction(new ObjectId(), customerOne, LocalDate.of(2024, 2, 10), 85),
                new Transaction(new ObjectId(), customerOne, LocalDate.of(2024, 3, 5), 75),
                new Transaction(new ObjectId(), customerTwo, LocalDate.of(2024, 1, 18), 95),
                new Transaction(new ObjectId(), customerTwo, LocalDate.of(2024, 3, 25), 200)
        );

        when(transactionRepository.findAll()).thenReturn(transactions);

        List<Transaction> result = transactionService.findAllTransactions();

        assertNotNull(result);
        assertEquals(5, result.size());
        assertEquals(transactions, result);
    }

    @Test
    @DisplayName("findAllTransactions should return empty list")
    void findAllTransactionsShouldReturnEmptyList() {
        when(transactionRepository.findAll()).thenReturn(List.of());

        List<Transaction> result = transactionService.findAllTransactions();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}