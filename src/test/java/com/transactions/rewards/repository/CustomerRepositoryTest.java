package com.transactions.rewards.repository;

import com.transactions.rewards.model.entity.Customer;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    @DisplayName("findById should work fine")
    void findByIdShouldWorkFine() {
        Customer customerOne = new Customer(new ObjectId(), "Customer One", "customerone@test.com");

        customerRepository.save(customerOne);

        Optional<Customer> result = customerRepository.findById(customerOne.getId());

        assertTrue(result.isPresent());
        assertEquals(customerOne, result.get());
    }

    @Test
    @DisplayName("deleteById should work fine")
    void deleteByIdShouldWorkFine() {
        Customer customerOne = new Customer(new ObjectId(), "Customer One", "customerone@test.com");
        customerRepository.save(customerOne);

        customerRepository.deleteById(customerOne.getId());

        Optional<Customer> result = customerRepository.findById(customerOne.getId());
        assertFalse(result.isPresent());
    }
}
