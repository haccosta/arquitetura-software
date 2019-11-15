package com.pucminas.dropshipping.integracao.domain;

import java.io.Serializable;

public class ItemVendaFornecedor implements Serializable {

    private int idVenda;
    private int idProduto;
    private int idFornecedor;
    private double valorUnitario;
    private int quantidadeSolicitada;
    private int situacaoAtendimento;


    public ItemVendaFornecedor(){}


    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(int quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public int getSituacaoAtendimento() {
        return situacaoAtendimento;
    }

    public void setSituacaoAtendimento(int situacaoAtendimento) {
        this.situacaoAtendimento = situacaoAtendimento;
    }
}
