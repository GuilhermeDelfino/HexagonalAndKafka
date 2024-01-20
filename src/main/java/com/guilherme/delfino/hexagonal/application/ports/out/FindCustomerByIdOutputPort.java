package com.guilherme.delfino.hexagonal.application.ports.out;

import com.guilherme.delfino.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
