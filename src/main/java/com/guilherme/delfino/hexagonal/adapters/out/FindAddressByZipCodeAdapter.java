package com.guilherme.delfino.hexagonal.adapters.out;

import com.guilherme.delfino.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.guilherme.delfino.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.guilherme.delfino.hexagonal.adapters.out.client.response.AddressResponse;
import com.guilherme.delfino.hexagonal.application.core.domain.Address;
import com.guilherme.delfino.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {
    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
