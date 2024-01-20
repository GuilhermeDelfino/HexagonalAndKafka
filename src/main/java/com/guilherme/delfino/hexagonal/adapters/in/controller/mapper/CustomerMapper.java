package com.guilherme.delfino.hexagonal.adapters.in.controller.mapper;

import com.guilherme.delfino.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.guilherme.delfino.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.guilherme.delfino.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.guilherme.delfino.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.http.ResponseEntity;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "cpfValid", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
    Customer toCustomer(CustomerEntity customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
