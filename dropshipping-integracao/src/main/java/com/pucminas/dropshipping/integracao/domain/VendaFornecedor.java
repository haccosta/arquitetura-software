package com.pucminas.dropshipping.integracao.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "pedido")
public class VendaFornecedor implements Serializable {


    @Id
    private int id;

    private Cliente cliente = new Cliente();
    private List<ItemVendaFornecedor> itemVendas = new ArrayList<ItemVendaFornecedor>();
    @Field(value="dataCompra")
    private String dataCompra;
    private int situacaoVenda;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVendaFornecedor> getItemVendas() { return itemVendas;}

    public void setItemVendas(List<ItemVendaFornecedor> itemVendas) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
