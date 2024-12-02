package com.transactions.rewards.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transactions")
public class Transaction {

    @Id
    private ObjectId id;
    @DBRef
    private Customer customer;
    private LocalDate date;
    private double amount;

    public Transaction(Customer customer, LocalDate date, double amount) {
        this(null, customer, date, amount);
    }
}
