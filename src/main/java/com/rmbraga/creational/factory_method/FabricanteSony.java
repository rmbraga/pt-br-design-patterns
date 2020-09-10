package com.rmbraga.creational.factory_method;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FabricanteSony implements FabricanteVideogame {
    private static final Map<TipoConsole, SonyConsole> SONY_CONSOLES;

    /**
     * Isto é um bloco de inicialização estática, como uma versão estática de um construtor.
     * Inicializadores estáticos são inicializados quando a classe é carregada.
     */
    static {
        SONY_CONSOLES = new HashMap<>(TipoConsole.values().length);
        Arrays.stream(TipoConsole.values()).forEach(tipo -> SONY_CONSOLES.put(tipo, new SonyConsole(tipo)));
    }

    @Override
    public Console fabricarVideogame(TipoConsole tipoConsole) {
        return SONY_CONSOLES.get(tipoConsole);
    }
}
