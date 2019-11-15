package com.pucminas.dropshipping.lojavirtual.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categoria",schema="public")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String categoria;

    @OneToMany(targetEntity=Produto.class, fetch= FetchType.EAGER)
    @JoinColumn(name="categoria")
    private List<Produto> produtos;


    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public List<Produto> getProduto(){
        return produtos;
    }

    public void setProduto(List<Produto> produtos){
        this.produtos.clear();
        this.produtos.addAll(produtos);
    }

}
