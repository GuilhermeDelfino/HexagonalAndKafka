package com.guilherme.delfino.hexagonal.application.ports.out;

public interface DeleteCustomerByIdOutputPort {
    void deleteById(String id);
}
