package com.pucminas.dropshipping.lojavirtual.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "pedido")
public class Venda implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long _id;
    private Cliente cliente = new Cliente();
    private List<ItemVenda> itemVendas = new ArrayList<ItemVenda>();
    private String dataCompra;
    private int situacaoVenda;


     public Venda(){
        this.setDataCompra(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItemVendas() {

        return itemVendas;
    }

    public void setItemVendas(List<ItemVenda> itemVendas) {
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

    public Long getId() {
        return _id;
    }

    public void setId(Long id) {
        this._id = id;
    }
}
