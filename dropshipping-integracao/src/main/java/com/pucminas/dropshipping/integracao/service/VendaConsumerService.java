package com.pucminas.dropshipping.integracao.service;


import com.pucminas.dropshipping.integracao.domain.VendaFornecedor;
import com.pucminas.dropshipping.integracao.repository.VendaRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;


@Configuration
public class VendaConsumerService {

    @Autowired
    VendaRepository vendaRepository;

    @RabbitListener(queues = {"${queue.order.name}"})
    public void receive(@Payload VendaFornecedor venda) {

      vendaRepository.save(venda);
    }
}