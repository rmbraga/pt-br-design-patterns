package com.rmbraga.creational.builders;

import static com.rmbraga.creational.builders.enums.Carroceria.HATCHBACK;
import static com.rmbraga.creational.builders.enums.Carroceria.SEDA;
import static com.rmbraga.creational.builders.enums.Cor.*;
import static com.rmbraga.creational.builders.enums.Montadora.*;

public class Aplicacao {
    public static void main(String[] args) {
        builderPadrao();
        builderComInterfaceFluente();
        builderComJava8();
    }

    public static void builderPadrao() {
        var builderCarro = new BuilderCarro(MERCEDES, HATCHBACK);

        builderCarro.setAno(2020);
        builderCarro.setCor(VERMELHO);
        builderCarro.setNumeroDeLugares(5);

        var carro = builderCarro.buildCarro();

        System.out.printf(carro.toString());
    }

    public static void builderComInterfaceFluente() {
        var carro = new FluentBuilderCarro(FORD, SEDA)
                .setCor(PRETO)
                .setAno(1967)
                .setNumeroDeLugares(5)
                .buildCarro();

        System.out.println(carro);
    }

    public static void builderComJava8() {
        var carro = new BuilderCarroJ8()
                .with(c -> {
                    c.montadora = GM;
                    c.carroceria = SEDA;
                    c.ano = 2015;
                    c.cor = PRATA;
                    c.numeroDeLugares = 5;
                })
                .buildCarro();

        System.out.println(carro);
    }
}
