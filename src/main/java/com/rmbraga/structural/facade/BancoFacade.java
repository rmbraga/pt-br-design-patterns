package com.rmbraga.structural.facade;

public class BancoFacade {
    private int numeroConta;
    private int codigoSeguranca;

    ValidadorConta validadorConta;
    ValidadorSeguranca validadorSeguranca;
    ValidadorSaldo validadorSaldo;

    Banco banco;

    public BancoFacade(int numeroContaDoCliente, int codigoSegurancaDoCliente) {
        this.numeroConta = numeroContaDoCliente;
        this.codigoSeguranca = codigoSegurancaDoCliente;

        banco = new Banco();
        validadorConta = new ValidadorConta();
        validadorSeguranca = new ValidadorSeguranca();
        validadorSaldo = new ValidadorSaldo();
    }

    public int retornarNumeroConta(){
        return numeroConta;
    }

    public int retornarCodigoSeguraca() {
        return codigoSeguranca;
    }

    public void efetuarSaque(double valorSaque) {
        if(verificarAcessoCliente() && validadorSaldo.existeSaldoDisponivel(valorSaque)) {
            System.out.println("Transação efetuada com SUCESSO\n");
        } else {
            System.out.println("A Transação falhou\n");
        }
    }

    public void efetuarDeposito(double valorDeposito) {
        if(verificarAcessoCliente()) {
            validadorSaldo.creditoEmConta(valorDeposito);
            System.out.println("Depósito efetuado com SUCESSO");
        } else {
            System.out.println("A Transação falhou\n");
        }
    }

    public double verificarSaldo() {
        if(!verificarAcessoCliente()) {
            System.out.println("Saldo Disponível: " + validadorSaldo.retornarSaldo());
            return validadorSaldo.retornarSaldo();
        } else {
            System.out.println("Erro na autenticação do cliente e conta");
            return 0; //retorna R$ 0.00 para simplificacao do exemplo.
        }
    }

    private boolean verificarAcessoCliente() {
        return validadorConta.verificarContaAtiva(numeroConta) &&
                validadorSeguranca.verificarCodigoSeguranca(codigoSeguranca);
    }
}
