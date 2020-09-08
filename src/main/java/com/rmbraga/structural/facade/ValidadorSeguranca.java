package com.rmbraga.structural.facade;

public class ValidadorSeguranca {

    private int codigoSeguranca = 123;

    public int retornarCodigoSeguranca() {
        return codigoSeguranca;
    }

    public boolean verificarCodigoSeguranca(int codigoSegurancaDoUsuario) {
        if(codigoSegurancaDoUsuario == codigoSeguranca){
            return true;
        } else {
            return false;
        }
    }
}
