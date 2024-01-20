package com.guilherme.delfino.hexagonal.adapters.in.controller;

import com.guilherme.delfino.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.guilherme.delfino.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.guilherme.delfino.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.guilherme.delfino.hexagonal.application.core.domain.Customer;
import com.guilherme.delfino.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.guilherme.delfino.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.guilherme.delfino.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.guilherme.delfino.hexagonal.application.ports.in.UpdateCustomerInputPort;
import feign.Response;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private final InsertCustomerInputPort insertCustomerInputPort;
    private final CustomerMapper customerMapper;
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final UpdateCustomerInputPort updateCustomerInputPort;
    private final DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        Customer customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        Customer customer = findCustomerByIdInputPort.find(id);
        return ResponseEntity.ok(customerMapper.toCustomerResponse(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable String id, @RequestBody CustomerRequest customerRequest){
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id){
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
