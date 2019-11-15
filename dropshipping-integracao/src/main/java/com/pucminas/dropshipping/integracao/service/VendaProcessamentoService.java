package com.pucminas.dropshipping.integracao.service;


import com.pucminas.dropshipping.integracao.domain.ItemVendaFornecedor;
import com.pucminas.dropshipping.integracao.domain.VendaFornecedor;
import com.pucminas.dropshipping.integracao.dto.VendaFornecedorDTO;
import com.pucminas.dropshipping.integracao.repository.VendaRepository;
import io.spring.guides.gs_producing_web_service.*;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class VendaProcessamentoService {

    private static final int SITUACAO_ATENDIMENTO_ABERTA = 1;
    private static final int SITUACAO_ATENDIMENTO_PROCESSADA = 2;

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public String atualizarVendaFornecedor(VendaFornecedorAtualizar vendaSoap) {

        List<ItemVendaFornecedor> itensFornecedor;


        VendaFornecedorDTO vendaFornecedorDTO = new VendaFornecedorDTO();
        vendaFornecedorDTO.setIdVenda(vendaSoap.getId());
        vendaFornecedorDTO.setIdFornecedor(vendaSoap.getIdFornecedor());

        for (ItemVendaAbertaFornecedor codigoPedidoItem : vendaSoap.getCodigoProdutoLiberado()) {

            vendaFornecedorDTO.getCodigoProdutoLiberado().add(codigoPedidoItem.getId());
        }


        VendaFornecedor venda = vendaRepository.findVendaAbertaById(vendaFornecedorDTO.getIdVenda(), vendaFornecedorDTO.getIdFornecedor());

        if (venda == null) {
            return "Venda não encontrada!";
        }


        for (ItemVendaFornecedor itemVenda : venda.getItemVendas()) {
            for (Integer codigoProduto : vendaFornecedorDTO.getCodigoProdutoLiberado()) {
                if (codigoProduto == itemVenda.getIdProduto()) {
                    itemVenda.setSituacaoAtendimento(SITUACAO_ATENDIMENTO_PROCESSADA);
                }

            }

        }
        rabbitTemplate.convertAndSend(this.queue.getName(), venda);

        return "Atualização realizada com sucesso!";
    }

    public List<Venda> getVendaAbertaFornecedor(int idFornecedor) {
        List<VendaFornecedor> vendas = vendaRepository.findVendaAbertaByFornecedor(idFornecedor, SITUACAO_ATENDIMENTO_ABERTA);

        List<Venda> vendasSoap = new ArrayList<>();
        List<ItemVenda> itensVendaSoap;

        for (VendaFornecedor vendaFornecedor : vendas) {

            Venda vendaSoap = new Venda();
            vendaSoap.setDataVenda(vendaFornecedor.getDataCompra());
            vendaSoap.setSituacaoVenda(BigInteger.valueOf(vendaFornecedor.getSituacaoVenda()));
            vendaSoap.setId(vendaFornecedor.getId());

            Cliente clienteSoap = new Cliente();

            clienteSoap.setNome(vendaFornecedor.getCliente().getNome());
            clienteSoap.setEmail(vendaFornecedor.getCliente().getEmail());

            vendaSoap.setCliente(clienteSoap);

            itensVendaSoap = new ArrayList<ItemVenda>();

            for (ItemVendaFornecedor itemVendaFornecedor : vendaFornecedor.getItemVendas()) {

                if (itemVendaFornecedor.getIdFornecedor() == idFornecedor) {


                    ItemVenda itemVendaSoap = new ItemVenda();
                    itemVendaSoap.setIdFornecedor(itemVendaFornecedor.getIdFornecedor());
                    itemVendaSoap.setIdProduto(itemVendaFornecedor.getIdProduto());
                    itemVendaSoap.setIdVenda(itemVendaFornecedor.getIdVenda());
                    itemVendaSoap.setQuantidadeSolicitada(itemVendaFornecedor.getQuantidadeSolicitada());
                    itemVendaSoap.setValorUnitario(itemVendaFornecedor.getValorUnitario());

                    itensVendaSoap.add(itemVendaSoap);
                }
            }

            vendaSoap.getItensVenda().clear();
            vendaSoap.getItensVenda().addAll(itensVendaSoap);

            vendasSoap.add(vendaSoap);

        }


        return vendasSoap;
    }
}
