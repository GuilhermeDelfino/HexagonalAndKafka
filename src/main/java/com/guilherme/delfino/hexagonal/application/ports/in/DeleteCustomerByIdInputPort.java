package com.guilherme.delfino.hexagonal.application.ports.in;

public interface DeleteCustomerByIdInputPort {
    void delete(String id);
}
