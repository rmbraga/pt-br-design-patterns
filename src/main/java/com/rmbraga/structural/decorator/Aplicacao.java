package com.rmbraga.structural.decorator;

public class Aplicacao {

    public static void main(String[] args) {
        ArvoreNatalina primeiraArvore = new LuzesNatalinas(new ArvoreNatalinaImpl());
        System.out.println(primeiraArvore.decorar());

        ArvoreNatalina segundaArvore = new GlobosNatalinos(new LuzesNatalinas(new ArvoreNatalinaImpl()));
        System.out.println(segundaArvore.decorar());
    }
}
