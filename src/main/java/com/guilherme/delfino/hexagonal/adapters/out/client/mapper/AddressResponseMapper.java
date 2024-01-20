package com.guilherme.delfino.hexagonal.adapters.out.client.mapper;

import com.guilherme.delfino.hexagonal.adapters.out.client.response.AddressResponse;
import com.guilherme.delfino.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
