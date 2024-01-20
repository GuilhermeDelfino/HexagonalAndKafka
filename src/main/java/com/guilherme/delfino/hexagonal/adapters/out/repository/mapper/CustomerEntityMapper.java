package com.guilherme.delfino.hexagonal.adapters.out.repository.mapper;

import com.guilherme.delfino.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.guilherme.delfino.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
