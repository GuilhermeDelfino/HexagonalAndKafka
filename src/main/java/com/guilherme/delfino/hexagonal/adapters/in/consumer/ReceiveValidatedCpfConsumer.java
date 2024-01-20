package com.guilherme.delfino.hexagonal.adapters.in.consumer;

import com.guilherme.delfino.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.guilherme.delfino.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.guilherme.delfino.hexagonal.application.ports.in.UpdateCustomerInputPort;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ReceiveValidatedCpfConsumer {
    private final UpdateCustomerInputPort updateCustomerInputPort;
    private final CustomerMessageMapper mapper;
    private final
    @KafkaListener(topics = "tp-cpf-validated", groupId = "delfino")
    void receive(CustomerMessage message){
        updateCustomerInputPort.update(mapper.toCustomer(message), message.getZipCode());
    }
}
