package com.guilherme.delfino.hexagonal.application.ports.in;

import com.guilherme.delfino.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
