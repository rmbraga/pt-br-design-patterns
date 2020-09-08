package com.rmbraga.structural.facade;

public class ValidadorConta {
    private int numeroConta = 123456;

    public int retornarNumeroDaConta() {
        return numeroConta;
    }

    public boolean verificarContaAtiva(int numeroContaDoUsuario) {
        if(numeroContaDoUsuario == numeroConta) {
            return true;
        } else {
            return false;
        }
    }
}
