package com.rmbraga.creational.builders.enums;

public enum Carroceria {
    HATCHBACK("HATCHBACK"),
    SEDA("SEDA"),
    CONVERSIVEL("CONVERSIVEL"),
    SUV("SUV");

    private String valor;

    Carroceria(String valor) {
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
