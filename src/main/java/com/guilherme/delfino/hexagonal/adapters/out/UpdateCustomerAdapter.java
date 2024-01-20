package com.guilherme.delfino.hexagonal.adapters.out;

import com.guilherme.delfino.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.guilherme.delfino.hexagonal.adapters.out.repository.CustomerRepository;
import com.guilherme.delfino.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.guilherme.delfino.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.guilherme.delfino.hexagonal.application.core.domain.Customer;
import com.guilherme.delfino.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    private CustomerRepository customerRepository;
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void update(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
