package com.rmbraga.behavioral.enums;

public enum Cor {
    VERMELHO("VERMELHO"),
    AZUL("AZUL"),
    BRANCO("BRANCO"),
    PRETO("PRETO"),
    PRATA("PRATA");

    private String valor;

    Cor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
