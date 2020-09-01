package com.rmbraga.creational.builders.enums;

public enum Montadora {
    FORD("FORD"),
    GM("GM"),
    VOLKSWAGEN("VOLKSWAGEN"),
    BMW("BMW"),
    MERCEDES("MERCEDES-BENZ"),
    AUDI("AUDI");

    private String valor;

    Montadora(String valor) {
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
