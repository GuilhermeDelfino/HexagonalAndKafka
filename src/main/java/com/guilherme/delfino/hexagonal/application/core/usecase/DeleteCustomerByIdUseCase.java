package com.guilherme.delfino.hexagonal.application.core.usecase;

import com.guilherme.delfino.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.guilherme.delfino.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.guilherme.delfino.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {
    private final FindCustomerByIdInputPort findCustomerByInputPort;
    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;
    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByInputPort = findCustomerByInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id){
        findCustomerByInputPort.find(id);
        deleteCustomerByIdOutputPort.deleteById(id);
    }
}
