package com.guilherme.delfino.hexagonal.application.core.domain;

public class Customer {
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private boolean isCpfValid;

    public boolean isCpfValid() {
        return isCpfValid;
    }

    public void setCpfValid(boolean cpfValid) {
        isCpfValid = cpfValid;
    }

    public Customer() {
        this.isCpfValid = false;
    }

    public Customer(String id, String name, Address address, String cpf, Boolean isCpfValid) {
        this.id = id;
        this.name = name;
        address = address;
        this.cpf = cpf;
        this.isCpfValid = isCpfValid;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
