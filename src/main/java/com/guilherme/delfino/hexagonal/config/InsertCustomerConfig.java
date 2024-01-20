package com.guilherme.delfino.hexagonal.config;

import com.guilherme.delfino.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.guilherme.delfino.hexagonal.adapters.out.InsertCustomerAdapter;
import com.guilherme.delfino.hexagonal.application.core.usecase.InsertCustomerUseCase;
import com.guilherme.delfino.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerAdapter insertCustomerAdapter, SendCpfValidationAdapter sendCpfValidationAdapter){
        return new InsertCustomerUseCase(findAddressByZipCodeOutputPort, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
