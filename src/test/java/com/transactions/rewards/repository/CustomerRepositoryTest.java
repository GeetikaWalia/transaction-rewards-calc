package com.transactions.rewards.repository;

import com.transactions.rewards.model.entity.Customer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static com.transactions.rewards.utils.TestData.customer;
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
        Customer customerOne = customer("Customer One", "customerone@test.com");

        customerRepository.save(customerOne);

        Optional<Customer> result = customerRepository.findById(customerOne.getId());

        assertTrue(result.isPresent());
        assertEquals(customerOne, result.get());
    }

    @Test
    @DisplayName("deleteById should work fine")
    void deleteByIdShouldWorkFine() {
        Customer customerOne = customer("Customer One", "customerone@test.com");
        customerRepository.save(customerOne);

        customerRepository.deleteById(customerOne.getId());

        Optional<Customer> result = customerRepository.findById(customerOne.getId());
        assertFalse(result.isPresent());
    }
}
