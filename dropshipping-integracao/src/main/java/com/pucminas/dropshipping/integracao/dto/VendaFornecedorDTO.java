package com.pucminas.dropshipping.integracao.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VendaFornecedorDTO implements Serializable {
    @NotNull
    private int idFornecedor;
    @NotNull
    private int idVenda;
    @NotNull
    private List<Integer> codigoProdutoLiberado = new ArrayList<>();

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public List<Integer> getCodigoProdutoLiberado() {
        return codigoProdutoLiberado;
    }

    public void setCodigoProdutoLiberado(List<Integer> codigoProdutoLiberado) {
        this.codigoProdutoLiberado = codigoProdutoLiberado;
    }
}
