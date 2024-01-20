package com.guilherme.delfino.hexagonal.application.core.usecase;

import com.guilherme.delfino.hexagonal.application.core.domain.Customer;
import com.guilherme.delfino.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.guilherme.delfino.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {
    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(()-> new RuntimeException("Customer with id "+ id +" not found"));
    }
}
