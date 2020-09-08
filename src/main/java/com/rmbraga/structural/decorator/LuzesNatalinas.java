package com.rmbraga.structural.decorator;

public class LuzesNatalinas extends ArvoreDecorador {

    public LuzesNatalinas(ArvoreNatalina arvore) {
        super(arvore);
    }

    public String decorar() {
        return super.decorar() + decorarComLuzes();
    }

    public String decorarComLuzes() {
        return " com luzes";
    }

}
