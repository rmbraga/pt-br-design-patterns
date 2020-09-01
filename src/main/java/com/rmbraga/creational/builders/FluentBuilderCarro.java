package com.rmbraga.creational.builders;

import com.rmbraga.creational.builders.enums.Carroceria;
import com.rmbraga.creational.builders.enums.Cor;
import com.rmbraga.creational.builders.enums.Montadora;

public class FluentBuilderCarro {
    private Montadora montadora;
    private Carroceria carroceria;
    private Cor cor;
    private int numeroDeLugares;
    private int ano;

    /**
     * Criando um construtor para garantir que o nosso carro
     * tenha pelo menos dois atributos
     */
    public FluentBuilderCarro(Montadora montadora, Carroceria carroceria) {
        validarSeNulo(montadora, carroceria);

        this.montadora = montadora;
        this.carroceria = carroceria;
    }

    private void validarSeNulo(Montadora montadora, Carroceria carroceria) {
        if (montadora == null || carroceria == null) {
            throw new IllegalArgumentException("Montadora e Carroceria não podem ser nulos ou estar em branco!");
        }
    }

    public FluentBuilderCarro setMontadora(Montadora montadora) {
        this.montadora = montadora;
        return this;
    }

    public FluentBuilderCarro setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
        return this;
    }

    public FluentBuilderCarro setCor(Cor cor) {
        this.cor = cor;
        return this;
    }

    public FluentBuilderCarro setNumeroDeLugares(int numeroDeLugares) {
        this.numeroDeLugares = numeroDeLugares;
        return this;
    }

    public FluentBuilderCarro setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public Carro buildCarro() {
        return new Carro(montadora, carroceria, cor, numeroDeLugares, ano);
    }
}
