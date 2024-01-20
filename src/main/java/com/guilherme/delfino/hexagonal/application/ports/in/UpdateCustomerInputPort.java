package com.guilherme.delfino.hexagonal.application.ports.in;

import com.guilherme.delfino.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
