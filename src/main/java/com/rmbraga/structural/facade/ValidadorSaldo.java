package com.rmbraga.structural.facade;

public class ValidadorSaldo {

    private double saldo = 200.00;

    public double retornarSaldo() {
        return saldo;
    }

    public double creditoEmConta(double valorDeposito){
        return  saldo += valorDeposito;
    }

    public double debitoEmConta(double valorSaque) {
        return saldo -= valorSaque;
    }

    public boolean existeSaldoDisponivel(double valorDoSaque) {
        if(valorDoSaque > retornarSaldo()) {
            System.out.println("ERRO: Você não possui saldo suficiente.\n");
            System.out.println("Saldo Disponível: " + retornarSaldo());

            return false;
        } else {
            debitoEmConta(valorDoSaque);
            System.out.println("Saque efetuado com SUCCESSO\n");
            System.out.println("Saldo Atual: " + retornarSaldo());

            return true;
        }
    }
}
