package com.guilherme.delfino.hexagonal.config;

import com.guilherme.delfino.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.guilherme.delfino.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.guilherme.delfino.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerById {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdOutputPort);
    }
}
