package com.guilherme.delfino.hexagonal.application.ports.out;

import com.guilherme.delfino.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
