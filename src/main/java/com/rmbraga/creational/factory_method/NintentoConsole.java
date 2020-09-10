package com.rmbraga.creational.factory_method;

public class NintentoConsole implements Console {
    private final TipoConsole tipoConsole;

    public NintentoConsole(TipoConsole tipoConsole) {
        this.tipoConsole = tipoConsole;
    }

    @Override
    public String toString() {
        return "Nintendo: Console do tipo > " + tipoConsole;
    }

    @Override
    public TipoConsole retornarTipoConsole() {
        return tipoConsole;
    }
}
