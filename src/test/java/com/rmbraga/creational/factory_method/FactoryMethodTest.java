package com.rmbraga.creational.factory_method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.rmbraga.creational.factory_method.TipoConsole.*;

public class FactoryMethodTest {

    @Test
    public void criarConsoleNintendoTest() {
        var fabricante = new FabricanteNintendo();
        var console = fabricante.fabricarVideogame(PORTATIL);
        Assertions.assertTrue(NintentoConsole.class.isInstance(console));
        Assertions.assertEquals(PORTATIL, console.retornarTipoConsole());
    }

    @Test
    public void criarConsoleSonyTest() {
        var fabricante = new FabricanteSony();
        var console = fabricante.fabricarVideogame(MESA);
        Assertions.assertTrue(SonyConsole.class.isInstance(console));
        Assertions.assertEquals(MESA, console.retornarTipoConsole());
    }

}
