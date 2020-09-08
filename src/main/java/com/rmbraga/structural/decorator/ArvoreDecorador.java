package com.rmbraga.structural.decorator;

public abstract class ArvoreDecorador implements ArvoreNatalina {
    private ArvoreNatalina arvore;

    public ArvoreDecorador(ArvoreNatalina arvore) {
        this.arvore = arvore;
    }

    @Override
    public String decorar() {
        return arvore.decorar();
    }
}
