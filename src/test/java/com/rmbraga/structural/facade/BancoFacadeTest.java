package com.rmbraga.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BancoFacadeTest {
    private final int nrContaCliente = 123456;
    private final int codSegCliente = 123;

    @Test
    public void verificarContaInvalidaTest() {
        int contaInvalida = 123000;
        BancoFacade bancoFacade = new BancoFacade(contaInvalida, codSegCliente);

        assertTrue(!bancoFacade.validadorConta.verificarContaAtiva(contaInvalida));
    }

    @Test
    public void verificarCodigoSegurancaInvalidoTest() {
        int codSegInvalido = 000;
        BancoFacade bancoFacade = new BancoFacade(nrContaCliente, codSegInvalido);

        assertTrue(!bancoFacade.validadorSeguranca.verificarCodigoSeguranca(codSegInvalido));
    }

    @Test
    public void verificarSaldoAposSaqueTest() {
        BancoFacade bancoFacade = new BancoFacade(nrContaCliente, codSegCliente);
        bancoFacade.efetuarSaque(100);

        assertEquals(bancoFacade.verificarSaldo(), 100.00);
    }

    @Test
    public void verificarSaldoAposDepositoTest() {
        BancoFacade bancoFacade = new BancoFacade(nrContaCliente, codSegCliente);
        bancoFacade.efetuarDeposito(50);

        assertEquals(bancoFacade.verificarSaldo(), 250.00);
    }

    @Test
    public void verificarSaldoAposSaquesDepositosTest() {
        BancoFacade bancoFacade = new BancoFacade(nrContaCliente, codSegCliente);
        // Considerando saldo inicial de R$ 200,00 efetuaremos um saque de R$ 100,00 e um deposito de R$ 50,00.
        bancoFacade.efetuarDeposito(50);
        bancoFacade.efetuarDeposito(50);
        bancoFacade.efetuarSaque(100);

        assertEquals(bancoFacade.verificarSaldo(), 250.00);
    }
}
