package com.rmbraga.structural.composite;

import com.rmbraga.structural.composite.enums.PosicaoEnum;

import java.util.ArrayList;
import java.util.List;

//Representa o COMPOSTO / COMPOSITE
public class Gerente implements Empregado {
    private String nome;
    private double salario;
    private PosicaoEnum posicao;
    List<Empregado> listaDeEmpregados = new ArrayList<Empregado>();

    public Gerente(String nome, double salario, PosicaoEnum posicao){
        validarSeNulo(nome, posicao);

        this.nome = nome;
        this.salario = salario;
        this.posicao = posicao;
    }

    private void validarSeNulo(String nome, PosicaoEnum posicao) {
        if(nome == null || posicao == null) {
            throw new IllegalArgumentException("Nome e posição não podem ser nulos.");
        }
    }

    public void remover(Empregado empregado) {
        listaDeEmpregados.remove(empregado);
    }

    public void adicionar(Empregado empregado) {
        listaDeEmpregados.add(empregado);
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
        stringBuilder.append("\nNome = " + retornarNome())
                .append("\nSalário = " + retornarSalario())
                .append("\nPosição = " + retornarPosicao());

        if(!listaDeEmpregados.isEmpty()) {
            stringBuilder.append("\n\n\tSUBORDINADOS\n");
            for (Empregado empregado : listaDeEmpregados) {
                stringBuilder.append(empregado.toString());
            }
        }
        return stringBuilder.toString();
    }

}