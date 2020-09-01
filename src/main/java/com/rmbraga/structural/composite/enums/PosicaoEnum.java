package com.rmbraga.structural.composite.enums;

public enum PosicaoEnum {
    DESENVOLVEDOR_UX("DESENVOLVEDOR UX"),
    DESENVOLVEDOR_DEVOPS("DESENVOLVEDOR DEVOPS"),
    DESENVOLVEDOR_FRONTEND("DESENVOLVEDOR FRONT-END"),
    DESENVOLVEDOR_BACKEND("DESENVOLVEDOR BACK-END"),
    GERENTE_GERAL("GERENTE GERAL"),
    GERENTE_FINANCEIRO("GERENTE FINANCEIRO"),
    DIRETOR("DIRETOR");

    private String valor;

    PosicaoEnum(String valor) {
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
