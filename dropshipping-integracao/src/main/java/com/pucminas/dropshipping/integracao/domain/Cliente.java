package com.pucminas.dropshipping.integracao.domain;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nome;
    private String email;


    public Cliente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
