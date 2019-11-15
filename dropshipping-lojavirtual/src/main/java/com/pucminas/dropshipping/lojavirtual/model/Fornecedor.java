package com.pucminas.dropshipping.lojavirtual.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "fornecedor",schema="public")
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

     private String nomeFantasia;

    @OneToMany(targetEntity=Produto.class, fetch= FetchType.EAGER)
    @JoinColumn(name="fornecedor")
    private List<Produto> produtos;


    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNomeFantasia(){
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public List<Produto> getProduto(){
        return produtos;
    }

    public void setProduto(List<Produto> produtos){
        this.produtos.clear();
        this.produtos.addAll(produtos);
    }
}
