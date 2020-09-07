package com.rmbraga.structural.proxy;

public class ObjetoCustosoImpl implements ObjetoCustoso {

    public ObjetoCustosoImpl(){
        carregarConfiguracaoInicial();
    }

    @Override
    public void processo() {
        // Para fins de teste, utilizaremos uma simples impressão de texto.
        System.out.println("Processo completo com SUCESSO!");
    }

    private void carregarConfiguracaoInicial() {
        System.out.println("Carregando configuração inicial...");
    }
}
