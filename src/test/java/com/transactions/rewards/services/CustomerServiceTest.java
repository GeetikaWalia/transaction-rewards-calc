package com.transactions.rewards.services;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.repository.CustomerRepository;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.*;

class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("findAllByCustomerId should return customerMap")
    void findAllByCustomerIdShouldReturnCustomerMap() {
        Customer customerOne = new Customer(new ObjectId(), "Customer One", "customerone@test.com");
        Customer customerTwo = new Customer(new ObjectId(), "Customer Two", "customertwo@test.com");

        Set<ObjectId> customerIds = Set.of(customerOne.getId(), customerTwo.getId());
        when(customerRepository.findAllById(customerIds)).thenReturn(Arrays.asList(customerOne, customerTwo));

        Map<ObjectId, Customer> result = customerService.findAllByCustomerId(customerIds);

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(customerOne, result.get(customerOne.getId()));
        assertEquals(customerTwo, result.get(customerTwo.getId()));
        verify(customerRepository, times(1)).findAllById(customerIds);
    }

    @Test
    @DisplayName("findAllByCustomerId should return emptyMap")
    void findAllByCustomerIdShouldReturnEmptyMap() {
        Customer customerOne = new Customer(new ObjectId(), "Customer One", "customerone@test.com");
        Customer customerTwo = new Customer(new ObjectId(), "Customer Two", "customertwo@test.com");

        Set<ObjectId> customerIds = Set.of(customerOne.getId(), customerTwo.getId());
        when(customerRepository.findAllById(customerIds)).thenReturn(List.of());

        Map<ObjectId, Customer> result = customerService.findAllByCustomerId(customerIds);

        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(customerRepository, times(1)).findAllById(customerIds);
    }
}
