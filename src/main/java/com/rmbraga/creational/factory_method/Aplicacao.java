package com.rmbraga.creational.factory_method;

public class Aplicacao {
    private final FabricanteVideogame fabricanteVideogame;

    /**
     * Criaremos aqui uma instancia da Aplicacao que usara um FabricanteVideogame
     * para fabricar os nossos consoles.
     * A nossa Aplicacao não sabe qual classe concreta estaremos usando para criar nossos consoles.
     * @param fabricanteVideogame
     */
    public Aplicacao(FabricanteVideogame fabricanteVideogame) {
        this.fabricanteVideogame = fabricanteVideogame;
    }

    private void fabricarVideogame() {
        var console = fabricanteVideogame.fabricarVideogame(TipoConsole.MESA);
        System.out.println(console.toString());

        console = fabricanteVideogame.fabricarVideogame(TipoConsole.PORTATIL);
        System.out.println(console.toString());
    }

    public static void main(String[] args) {
        var console = new Aplicacao(new FabricanteNintendo());
        console.fabricarVideogame();

        console = new Aplicacao(new FabricanteSony());
        console.fabricarVideogame();
    }

}