package com.rmbraga.creational.factory_method;

public enum TipoConsole {
    MESA("MESA"),
    PORTATIL("PORTATIL");

    private String valor;

    TipoConsole(String valor) {
        this.valor = valor;
    }

    public String retornarValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
