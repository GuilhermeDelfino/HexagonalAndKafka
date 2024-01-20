package com.guilherme.delfino.hexagonal.adapters.out;

import com.guilherme.delfino.hexagonal.adapters.out.repository.CustomerRepository;
import com.guilherme.delfino.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.guilherme.delfino.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.guilherme.delfino.hexagonal.application.core.domain.Customer;
import com.guilherme.delfino.hexagonal.application.ports.out.InsertCustomerOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InsertCustomerAdapter implements InsertCustomerOutputPort {
    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;
    @Override
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
