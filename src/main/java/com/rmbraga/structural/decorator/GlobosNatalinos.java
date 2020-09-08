package com.rmbraga.structural.decorator;

public class GlobosNatalinos extends ArvoreDecorador {

    public GlobosNatalinos(ArvoreNatalina arvore) {
        super(arvore);
    }

    public String decorar() {
        return super.decorar() + decorarComGlobos();
    }

    public String decorarComGlobos() {
        return " com globos natalinos";
    }

}
