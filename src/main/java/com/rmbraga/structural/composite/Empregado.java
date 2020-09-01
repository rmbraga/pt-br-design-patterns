package com.rmbraga.structural.composite;

//Represents the COMPONENTE / COMPONENT
public interface Empregado {
    void adicionar(Empregado employee);
    void remover(Empregado employee);
    String retornarNome();
    double retornarSalario();
    String retornarPosicao();
    String toString();
}
