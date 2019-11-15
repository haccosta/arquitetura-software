package com.pucminas.dropshipping.lojavirtual.service;


import com.pucminas.dropshipping.lojavirtual.dao.SequenceDAO;
import com.pucminas.dropshipping.lojavirtual.domain.ItemVenda;
import com.pucminas.dropshipping.lojavirtual.domain.Venda;
import com.pucminas.dropshipping.lojavirtual.dto.EmailAvisoClienteDTO;
import com.pucminas.dropshipping.lojavirtual.dto.VendaDTO;
import com.pucminas.dropshipping.lojavirtual.repository.VendaRepository;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


@Service
public class VendaProcessamentoService {

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private SequenceDAO sequenceDAO;


    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    private static final String HOSTING_SEQ_KEY = "hosting";

    public Venda findByVendaCliente(Long idVenda) {
        return vendaRepository.findVendaByCliente(idVenda);
    }

    public void registrarVenda(VendaDTO vendaDTO) {
        rabbitTemplate.convertAndSend(this.queue.getName(), vendaDTO);
    }

    @RabbitListener(queues = {"${queue.order.name}"})
    public void receive(@Payload Venda venda) {
        venda.setId(sequenceDAO.getNextSequenceId(HOSTING_SEQ_KEY));

        for(ItemVenda itemVenda : venda.getItemVendas()){
            itemVenda.setIdVenda(venda.getId());

        }


        vendaRepository.save(venda);

    }


}


