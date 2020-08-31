package com.rmbraga.structural.composite.enums;

public enum DiretoriaEnum {
    DIRETORIA_FINANCEIRA("DIRETORIA GERAL"),
    DIRETORIA_GERAL("DIRETORIA FINANCEIRA"),
    GERENTE_GERAL("GERENTE GERAL");

    private String valor;

    DiretoriaEnum(String valor) {
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
