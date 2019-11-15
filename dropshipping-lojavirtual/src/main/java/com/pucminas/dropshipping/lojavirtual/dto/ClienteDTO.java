package com.pucminas.dropshipping.lojavirtual.dto;

import java.io.Serializable;

public class ClienteDTO implements Serializable {
    private String nome;
    private String email;

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
