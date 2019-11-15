package com.pucminas.dropshipping.lojavirtual.dto;

public class EmailAvisoClienteDTO {
    private String emailDestino;
    private String emailAssunto;
    private String emailTexto;

    public String getEmailDestino() {
        return emailDestino;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }

    public String getEmailAssunto() {
        return emailAssunto;
    }

    public void setEmailAssunto(String emailAssunto) {
        this.emailAssunto = emailAssunto;
    }

    public String getEmailTexto() {
        return emailTexto;
    }

    public void setEmailTexto(String emailTexto) {
        this.emailTexto = emailTexto;
    }
}
