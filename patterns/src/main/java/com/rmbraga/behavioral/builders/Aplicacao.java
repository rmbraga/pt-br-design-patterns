package com.rmbraga.behavioral.builders;

import static com.rmbraga.behavioral.enums.Carroceria.HATCHBACK;
import static com.rmbraga.behavioral.enums.Carroceria.SEDA;
import static com.rmbraga.behavioral.enums.Cor.PRETO;
import static com.rmbraga.behavioral.enums.Cor.VERMELHO;
import static com.rmbraga.behavioral.enums.Montadora.FORD;
import static com.rmbraga.behavioral.enums.Montadora.MERCEDES;

public class Aplicacao {
    public static void main(String[] args) {
        // Usando o builder sem uso de Fluent Interface (Interface Fluente)
        var builderCarro = new BuilderCarro(MERCEDES, HATCHBACK);

        builderCarro.setAno(2020);
        builderCarro.setCor(VERMELHO);
        builderCarro.setNumeroDeLugares(5);

        Carro carro = builderCarro.buildCarro();

        System.out.printf(carro.toString());

        // Usando o builder com o uso de Fluent Interface (Interface Fluente)
        var fluentBuilderCarro = new FluentBuilderCarro(FORD, SEDA)
                .setCor(PRETO)
                .setAno(1967)
                .setNumeroDeLugares(5)
                .buildCarro();

        System.out.println(fluentBuilderCarro);
    }
}
