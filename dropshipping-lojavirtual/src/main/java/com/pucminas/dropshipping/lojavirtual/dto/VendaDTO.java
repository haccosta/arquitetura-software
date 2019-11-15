package com.pucminas.dropshipping.lojavirtual.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class VendaDTO implements Serializable {

    private ClienteDTO cliente = new ClienteDTO();
    private List<ItemVendaDTO> itemVendas = new ArrayList<ItemVendaDTO>();
    private String dataCompra;
    private int situacaoVenda;

    public VendaDTO(){}

    public VendaDTO(ClienteDTO cliente, List<ItemVendaDTO> itemVendas) {
        this.setDataCompra(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
    }


    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<ItemVendaDTO> getItemVendas() {

        return itemVendas;
    }

    public void setItemVendas(List<ItemVendaDTO> itemVendas) {
        this.itemVendas = itemVendas;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public int getSituacaoVenda() {
        return situacaoVenda;
    }

    public void setSituacaoVenda(int situacaoVenda) {
        this.situacaoVenda = situacaoVenda;
    }
}
