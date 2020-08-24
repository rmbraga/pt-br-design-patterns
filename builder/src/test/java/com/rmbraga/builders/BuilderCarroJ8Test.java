package com.rmbraga.builders;

import org.junit.jupiter.api.Test;

import static com.rmbraga.enums.Carroceria.SEDA;
import static com.rmbraga.enums.Cor.PRATA;
import static com.rmbraga.enums.Montadora.GM;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BuilderCarroJ8Test {
    @Test
    void builderCarroJ8Test() {
        int ano = 2015;
        int numLugares = 5;

        var carro = new BuilderCarroJ8()
                .with(c -> {
                    c.montadora = GM;
                    c.carroceria = SEDA;
                    c.ano = ano;
                    c.cor = PRATA;
                    c.numeroDeLugares = numLugares;
                })
                .buildCarro();

        assertNotNull(carro);
        assertNotNull(carro.toString());
        assertEquals(carro.getMontadora(), GM);
        assertEquals(carro.getCarroceria(), SEDA);
        assertEquals(carro.getCor(), PRATA);
        assertEquals(carro.getAno(), ano);
        assertEquals(carro.getNumeroDeLugares(), numLugares);
    }
}
