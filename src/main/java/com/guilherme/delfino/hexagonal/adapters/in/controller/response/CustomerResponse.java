package com.guilherme.delfino.hexagonal.adapters.in.controller.response;

import lombok.Data;

@Data
public class CustomerResponse {
    private String id;
    private String name;
    private AddressResponse Address;
    private String cpf;
    private Boolean isCpfValid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressResponse getAddress() {
        return Address;
    }

    public void setAddress(AddressResponse address) {
        Address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getCpfValid() {
        return isCpfValid;
    }

    public void setCpfValid(Boolean cpfValid) {
        isCpfValid = cpfValid;
    }
}
