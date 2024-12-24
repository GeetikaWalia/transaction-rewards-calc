package com.transactions.rewards.services;

import com.transactions.rewards.model.entity.Transaction;
import com.transactions.rewards.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<Transaction> findAllTransactionsForLast3Months() {
        LocalDate end = LocalDate.now();
        LocalDate start = end.minusMonths(3);
        return transactionRepository.findByDateBetweenOrderByDateDesc(start, end);
    }
}
