package com.rmbraga.structural.composite;

import com.rmbraga.structural.composite.enums.DiretoriaEnum;
import com.rmbraga.structural.composite.enums.PosicaoEnum;

public class Composicao {
    public static void main(String[] args) {
        // Composição de um gerente com mais de um desenvolvedor subordinado
        Empregado devFrontend = new Desenvolvedor("Rafael Martins", 1700, PosicaoEnum.DESENVOLVEDOR_FRONTEND);
        Empregado devBackend = new Desenvolvedor("Vinicius Peixoto", 1700, PosicaoEnum.DESENVOLVEDOR_BACKEND);
        Gerente gerente = new Gerente("Afonso Rodrigues",1900, PosicaoEnum.GERENTE_GERAL);
        gerente.adicionar(devFrontend);
        gerente.adicionar(devBackend);

        // Composição de uma diretoria, um gerente e seus subordinados em estrutura hierárquica
        Diretoria diretoriaFinanceira = new Diretoria(DiretoriaEnum.DIRETORIA_FINANCEIRA, gerente);
        System.out.println(diretoriaFinanceira.toString());

        // Composição de um gerente com um desenvolvedor subordinado
        Empregado devFrontend2 = new Desenvolvedor("Gertrudes Braganca", 2300, PosicaoEnum.DESENVOLVEDOR_FRONTEND);
        Gerente gerenteSuperior = new Gerente("Antonio Jobim", 2900, PosicaoEnum.GERENTE_FINANCEIRO);
        gerenteSuperior.adicionar(devFrontend2);

        // Composição de uma diretoria, um gerente e um subordinado
        Diretoria diretoriaGeral = new Diretoria(DiretoriaEnum.DIRETORIA_GERAL, gerenteSuperior);
        System.out.println(diretoriaGeral.toString());
    }
}
