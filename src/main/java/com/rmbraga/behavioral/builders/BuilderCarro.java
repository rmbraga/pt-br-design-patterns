package com.rmbraga.behavioral.builders;

import com.rmbraga.behavioral.builders.enums.Carroceria;
import com.rmbraga.behavioral.builders.enums.Cor;
import com.rmbraga.behavioral.builders.enums.Montadora;

public class BuilderCarro {
    private Montadora montadora;
    private Carroceria carroceria;
    private Cor cor;
    private int numeroDeLugares;
    private int ano;

    /**
     * Criando um construtor para garantir que o nosso carro
     * tenha pelo menos dois atributos
     */
    public BuilderCarro(Montadora montadora, Carroceria carroceria) {
        validarSeNulo(montadora, carroceria);

        this.montadora = montadora;
        this.carroceria = carroceria;
    }

    private void validarSeNulo(Montadora montadora, Carroceria carroceria) {
        if (montadora == null || carroceria == null) {
            throw new IllegalArgumentException("Montadora e Carroceria não podem ser nulos ou estar em branco!");
        }
    }


    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setNumeroDeLugares(int numeroDeLugares) {
        this.numeroDeLugares = numeroDeLugares;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Carro buildCarro() {
        return new Carro(montadora, carroceria, cor, numeroDeLugares, ano);
    }
}
