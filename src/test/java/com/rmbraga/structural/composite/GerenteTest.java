package com.rmbraga.structural.composite;

import org.junit.jupiter.api.Test;

import static com.rmbraga.structural.composite.enums.PosicaoEnum.DESENVOLVEDOR_BACKEND;
import static com.rmbraga.structural.composite.enums.PosicaoEnum.DESENVOLVEDOR_FRONTEND;
import static com.rmbraga.structural.composite.enums.PosicaoEnum.GERENTE_GERAL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GerenteTest {
    @Test
    public void gerenteSemNomeTest() {
        assertThrows(IllegalArgumentException.class, () -> new Gerente(null, 0, GERENTE_GERAL));
    }

    @Test
    public void gerenteSemPosicaoTest() {
        assertThrows(IllegalArgumentException.class, () -> new Gerente("Seu Ze", 2000, null));
    }

    @Test
    public void criarNovaGerente() {
        final String nomeDoGerente = "Teste";

        Empregado devFlutter = new Desenvolvedor("DevFlutter", 2000, DESENVOLVEDOR_FRONTEND);
        Empregado devJava = new Desenvolvedor("DevJava", 2000, DESENVOLVEDOR_BACKEND);
        Gerente gerente = new Gerente(nomeDoGerente, 3000, GERENTE_GERAL);
        gerente.adicionar(devFlutter);
        gerente.adicionar(devJava);

        assertNotNull(gerente);
        assertNotNull(gerente.toString());
        assertEquals(gerente.retornarNome(), nomeDoGerente);
        assertTrue(gerente.listaDeEmpregados.contains(devFlutter));
        assertTrue(gerente.listaDeEmpregados.contains(devJava));
    }
}
