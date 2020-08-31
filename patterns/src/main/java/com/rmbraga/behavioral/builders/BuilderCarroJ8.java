package com.rmbraga.builders;

import com.rmbraga.Carro;
import com.rmbraga.enums.Carroceria;
import com.rmbraga.enums.Cor;
import com.rmbraga.enums.Montadora;

import java.util.function.Consumer;

public class BuilderCarroJ8 {
    public Montadora montadora;
    public Carroceria carroceria;
    public Cor cor;
    public int numeroDeLugares;
    public int ano;

    public BuilderCarroJ8 with(Consumer<BuilderCarroJ8> builder) {
        builder.accept(this);
        return this;
    }

    public Carro buildCarro() {
        return new Carro(montadora, carroceria, cor, numeroDeLugares, ano);
    }
}
