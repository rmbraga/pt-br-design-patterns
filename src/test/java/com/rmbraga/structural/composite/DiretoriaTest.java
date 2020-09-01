package com.rmbraga.structural.composite;

import org.junit.jupiter.api.Test;

import static com.rmbraga.structural.composite.enums.DiretoriaEnum.DIRETORIA_GERAL;
import static com.rmbraga.structural.composite.enums.PosicaoEnum.GERENTE_GERAL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiretoriaTest {

    @Test
    public void diretoriaSemGerenteTest() {
        assertThrows(IllegalArgumentException.class, () -> new Diretoria(DIRETORIA_GERAL, null));
    }

    @Test
    public void diretoriaSemNomeTest() {
        Gerente gerente = new Gerente("Seu Ze", 2000, GERENTE_GERAL);
        assertThrows(IllegalArgumentException.class, () -> new Diretoria(null, gerente));
    }

    @Test
    public void criarNovaDiretoria() {
        final String nomeDaDiretoria = "Teste";

        Gerente gerente = new Gerente(nomeDaDiretoria, 3000, GERENTE_GERAL);
        Diretoria diretoriaGeral = new Diretoria(DIRETORIA_GERAL, gerente);

        assertNotNull(diretoriaGeral);
        assertNotNull(diretoriaGeral.toString());
        assertEquals(diretoriaGeral.retornarNome(), DIRETORIA_GERAL.getValor());
        assertEquals(diretoriaGeral.retornarGerente(), gerente);
        assertEquals(diretoriaGeral.retornarGerente().retornarNome(), nomeDaDiretoria);
    }
}
