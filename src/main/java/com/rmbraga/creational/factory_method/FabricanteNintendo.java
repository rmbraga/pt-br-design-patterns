package com.rmbraga.creational.factory_method;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FabricanteNintendo implements FabricanteVideogame {

    private static final Map<TipoConsole, NintentoConsole> NINTENDO_CONSOLES;

    /**
     * Isto é um bloco de inicialização estática, como uma versão estática de um construtor.
     * Inicializadores estáticos são inicializados quando a classe é carregada.
     */
    static {
        NINTENDO_CONSOLES = new HashMap<>(TipoConsole.values().length);
        Arrays.stream(TipoConsole.values()).forEach(tipo -> NINTENDO_CONSOLES.put(tipo, new NintentoConsole(tipo)));
    }

    @Override
    public Console fabricarVideogame(TipoConsole tipoConsole) {
        return NINTENDO_CONSOLES.get(tipoConsole);
    }
}
