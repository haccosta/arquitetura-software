package com.pucminas.dropshipping.integracao.service;


import com.pucminas.dropshipping.integracao.dto.VendaDTO;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendaQueueSenderService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(VendaDTO vendaDTO) {
         rabbitTemplate.convertAndSend(this.queue.getName(), vendaDTO);
    }
}
