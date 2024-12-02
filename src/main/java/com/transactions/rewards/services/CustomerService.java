package com.transactions.rewards.services;

import com.transactions.rewards.model.entity.Customer;
import com.transactions.rewards.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Map<ObjectId, Customer> findAllByCustomerId(Set<ObjectId> customerIds) {
        return customerRepository.findAllById(customerIds)
                .stream().collect(Collectors.toMap(Customer::getId, Function.identity()));
    }
}
