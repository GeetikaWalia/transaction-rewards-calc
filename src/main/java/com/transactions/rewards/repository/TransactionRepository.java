package com.transactions.rewards.repository;

import com.transactions.rewards.model.entity.Transaction;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, ObjectId> {
    List<Transaction> findByDateBetweenOrderByDateDesc(LocalDate dateStart, LocalDate dateEnd);

}