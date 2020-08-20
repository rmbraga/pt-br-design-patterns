package com.rmbraga;

import com.rmbraga.enums.Carroceria;
import com.rmbraga.enums.Cor;
import com.rmbraga.enums.Montadora;

public class Carro {
    private Montadora montadora;
    private Carroceria carroceria;
    private Cor cor;
    private int numeroDeLugares;
    private int ano;

    public Carro(Montadora montadora, Carroceria carroceria, Cor cor, int numeroDeLugares, int ano) {
        this.montadora = montadora;
        this.carroceria = carroceria;
        this.cor = cor;
        this.numeroDeLugares = numeroDeLugares;
        this.ano = ano;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public Cor getCor() {
        return cor;
    }

    public int getNumeroDeLugares() {
        return numeroDeLugares;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Carro:\n" +
                "Montadora = " + montadora +
                "\nCarroceria = " + carroceria +
                "\nCor = " + cor +
                "\nNúmero de lugares = " + numeroDeLugares +
                "\nAno = " + ano + '\n' + '\n';
    }
}
