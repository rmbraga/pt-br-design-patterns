package com.rmbraga.creational.singleton;

public class Aplicacao {

    public static void main(String[] args) {
        Singleton foo = Singleton.getInstance();
        Singleton bar = Singleton.getInstance();

        /**
         * Ao adicionar o nome Floki ao objeto foo, o mesmo
         * é também aplicado ao objeto bar, pois em singleton
         * podemos ter apenas uma instância de uma classe.
         *
         * Esse padrão garante que todos os objetos criados apontem
         * para a mesma instância da classe Singleton.
         *
         * E todas as variáveis dessa instância, mesmo que sendo
         * utilizadas em objetos diferentes, apontam sempre para
         * a mesma instância da classe, no mesmo endereço de memória.
         **/
        foo.nome = "Floki";
        imprimirNomes(foo.nome, bar.nome);

        bar.nome = bar.nome.toUpperCase();
        imprimirNomes(foo.nome, bar.nome);
    }

    public static void imprimirNomes(String nome, String nome2) {
        System.out.println(nome);
        System.out.println(nome2);
    }
}
