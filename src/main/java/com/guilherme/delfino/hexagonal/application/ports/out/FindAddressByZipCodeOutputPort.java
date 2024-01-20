package com.guilherme.delfino.hexagonal.application.ports.out;

import com.guilherme.delfino.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
