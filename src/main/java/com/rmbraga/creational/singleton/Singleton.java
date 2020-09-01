package com.rmbraga.creational.singleton;

public class Singleton {
    private static Singleton instance = new Singleton();

    public String nome;

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

//    public void exibirNome() {
//        System.out.println("Nome: " + this.nome);
//    }
}
