package com.guilherme.delfino.hexagonal.config;

import com.guilherme.delfino.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.guilherme.delfino.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.guilherme.delfino.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.guilherme.delfino.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase (FindCustomerByIdUseCase findCustomerByIdAdapter, FindAddressByZipCodeAdapter findAddressByZipCodeAdapter, UpdateCustomerAdapter updateCustomerAdapter){
        return new UpdateCustomerUseCase(findCustomerByIdAdapter, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
