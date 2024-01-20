package com.guilherme.delfino.hexagonal.adapters.out;

import com.guilherme.delfino.hexagonal.adapters.out.repository.CustomerRepository;
import com.guilherme.delfino.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {
    private final CustomerRepository repository;
    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
