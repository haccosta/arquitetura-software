package com.pucminas.dropshipping.lojavirtual.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "produto",schema="public")
@NamedQuery(name = "Produto.findAllProdutoByIdCategoria", query = "SELECT p FROM Produto p WHERE categoria = ?1 and situacaoProduto=1 AND qtdadeEstoque > 0")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @JsonAlias(value = "price")
    private double valorProduto;
    private String nomeProduto;
    private String descricaoProduto;
    @JsonAlias(value = "quantidade")
    private int qtdadeEstoque;
    @JsonAlias(value = "image")
    private String pathImagem;
    private int situacaoProduto = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQtdadeEstoque() {
        return qtdadeEstoque;
    }

    public void setQtdadeEstoque(int qtdadeEstoque) {
        this.qtdadeEstoque = qtdadeEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getPathImagem() {return pathImagem;}
    public void setPathImagem(String pathImagem){this.pathImagem = pathImagem;}

    public int getSituacaoProduto() {
        return situacaoProduto;
    }

    public void setSituacaoProduto(int situacaoProduto) {
        this.situacaoProduto = situacaoProduto;
    }
}
