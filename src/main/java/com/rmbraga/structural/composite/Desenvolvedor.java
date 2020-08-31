package com.rmbraga.structural.composite;

import com.rmbraga.structural.composite.enums.PosicaoEnum;

//Representa a FOLHA / LEAF
public class Desenvolvedor implements Empregado {

    private String nome;
    private double salario;
    private PosicaoEnum posicao;

    public Desenvolvedor(String nome, double salario, PosicaoEnum posicao){
        validarSeNulo(nome, posicao);

        this.nome = nome;
        this.salario = salario;
        this.posicao = posicao;
    }

    private void validarSeNulo(String name, PosicaoEnum posicao) {
        if(name == null || posicao == null) {
            throw new IllegalArgumentException("Nome e posição não podem ser nulos.");
        }
    }

    public void adicionar(Empregado empregado) {
        /* Este objeto é uma folha/leaf. Portanto, este método não é válido aqui. */
    }

    public void remover(Empregado employee) {
        /* Este objeto é uma folha/leaf. Portanto, este método não é válido aqui. */
    }

    public String retornarNome() {
        return nome;
    }

    public double retornarSalario() {
        return salario;
    }

    public String retornarPosicao() {
        return posicao.getValor();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t\tNome = " + retornarNome())
                .append("\n\t\tSalario = " + retornarSalario())
                .append("\n\t\tPosição = " + retornarPosicao() + "\n");
        return stringBuilder.toString();
    }

}
