package com.rmbraga;

import com.rmbraga.builders.BuilderCarro;
import com.rmbraga.builders.BuilderCarroJ8;
import com.rmbraga.builders.FluentBuilderCarro;

import static com.rmbraga.enums.Carroceria.HATCHBACK;
import static com.rmbraga.enums.Carroceria.SEDA;
import static com.rmbraga.enums.Cor.*;
import static com.rmbraga.enums.Montadora.*;

public class Aplicacao {
    public static void main(String[] args) {
        builderComum();
        builderComInterfaceFluente();
        builderComJava8();
    }

    public static void builderComum() {
        var builderCarro = new BuilderCarro(MERCEDES, HATCHBACK);

        builderCarro.setAno(2020);
        builderCarro.setCor(VERMELHO);
        builderCarro.setNumeroDeLugares(5);

        Carro carro = builderCarro.buildCarro();

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
