package com.rmbraga.creational.factory_method;

public class SonyConsole implements Console {
    private final TipoConsole tipoConsole;

    public SonyConsole(TipoConsole tipoConsole) {
        this.tipoConsole = tipoConsole;
    }

    @Override
    public String toString() {
        return "Sony: Console do tipo > " + tipoConsole;
    }

    @Override
    public TipoConsole retornarTipoConsole() {
        return tipoConsole;
    }
}
