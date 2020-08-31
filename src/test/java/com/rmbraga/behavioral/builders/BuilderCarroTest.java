package com.rmbraga.behavioral.builders;

import org.junit.jupiter.api.Test;

import static com.rmbraga.behavioral.builders.enums.Carroceria.CONVERSIVEL;
import static com.rmbraga.behavioral.builders.enums.Carroceria.SUV;
import static com.rmbraga.behavioral.builders.enums.Cor.PRATA;
import static com.rmbraga.behavioral.builders.enums.Montadora.AUDI;
import static com.rmbraga.behavioral.builders.enums.Montadora.FORD;
import static org.junit.jupiter.api.Assertions.*;

class BuilderCarroTest {

    @Test
    void builderCarroSemMontadoraTest() {
        assertThrows(IllegalArgumentException.class, () -> new BuilderCarro(null, SUV));
    }

    @Test
    void builderCarroSemCarroceriaTest() {
        assertThrows(IllegalArgumentException.class, () -> new BuilderCarro(FORD, null));
    }

    @Test
    void builderCarroTest() {
        final int numLugares = 5;
        final int ano = 2008;

        var carro = new BuilderCarro(AUDI, CONVERSIVEL);

        carro.setCor(PRATA);
        carro.setAno(ano);
        carro.setNumeroDeLugares(numLugares);

        Carro meuCarro = carro.buildCarro();

        assertNotNull(meuCarro);
        assertNotNull(meuCarro.toString());
        assertEquals(meuCarro.getMontadora(), AUDI);
        assertEquals(meuCarro.getCarroceria(), CONVERSIVEL);
        assertEquals(meuCarro.getCor(), PRATA);
        assertEquals(meuCarro.getAno(), ano);
        assertEquals(meuCarro.getNumeroDeLugares(), numLugares);
    }

}