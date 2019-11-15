package com.pucminas.dropshipping.lojavirtual.domain;

import java.io.Serializable;

public class ItemVenda implements Serializable {

    private long idVenda;
    private long idProduto;
    private long idFornecedor;
    private double valorUnitario;
    private double quantidadeSolicitada;
    private int situacaoAtendimento;


    public ItemVenda(){}


    public long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(long idVenda) {
        this.idVenda = idVenda;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(double quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public int getSituacaoAtendimento() {
        return situacaoAtendimento;
    }

    public void setSituacaoAtendimento(int situacaoAtendimento) {
        this.situacaoAtendimento = situacaoAtendimento;
    }
}
