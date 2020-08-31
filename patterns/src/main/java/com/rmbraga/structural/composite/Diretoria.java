package com.rmbraga.structural.composite;

import com.rmbraga.structural.enums.DiretoriaEnum;

import java.util.ArrayList;
import java.util.List;

//Represnta o COMPOSTO / COMPOSITE
public class Diretoria {
    private DiretoriaEnum nomeDaDiretoria;
    private Gerente gerente;
    private List<Empregado> listaDeEmpregados = new ArrayList<Empregado>();

    public Diretoria(DiretoriaEnum nomeDaDiretoria, Gerente gerente) {
        validarSeNulo(nomeDaDiretoria, gerente);
        this.nomeDaDiretoria = nomeDaDiretoria;
        this.gerente = gerente;
    }

    private void validarSeNulo(DiretoriaEnum nomeDaDiretoria, Gerente gerente) {
        if(nomeDaDiretoria == null || gerente == null) {
            throw new IllegalArgumentException("A Diretoria necessita de nome e de um gerente em cargo.");
        }
    }

    public void adicionar(Empregado empregado) {
        listaDeEmpregados.add(empregado);
    }

    public void remover(Empregado empregado) {
        listaDeEmpregados.remove(empregado);
    }

    public String retornarNome() {
        return nomeDaDiretoria.getValor();
    }

    public Gerente retornarGerente() {
        return gerente;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n======== " + retornarNome() + " ==========\n")
                .append("\nNome = " + nomeDaDiretoria)
                .append("\nGerente Responsável = " + retornarGerente().retornarNome() + "\n")
                .append("\nQUADRO FUNCIONAL\n")
                .append(gerente.toString());

        if(!listaDeEmpregados.isEmpty()) {
            stringBuilder.append("Time == >\n");
            for (Empregado empregado : listaDeEmpregados) {
                stringBuilder.append(empregado.toString());
            }
        }
        return stringBuilder.toString();
    }
}
