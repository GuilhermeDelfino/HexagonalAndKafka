package com.guilherme.delfino.hexagonal.application.ports.in;

import com.guilherme.delfino.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
