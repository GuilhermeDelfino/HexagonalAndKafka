package com.guilherme.delfino.hexagonal.adapters.out;

import com.guilherme.delfino.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.guilherme.delfino.hexagonal.adapters.out.repository.CustomerRepository;
import com.guilherme.delfino.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.guilherme.delfino.hexagonal.application.core.domain.Customer;
import com.guilherme.delfino.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    @Override
    public Optional<Customer> find(String id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);

        return customerEntity.map(customerMapper::toCustomer);
    }
}
