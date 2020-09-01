package com.rmbraga.structural.adapter;

public class MedidorCelsius {
    double temperaturaCelsius;

    public MedidorCelsius() {
    }

    public double retornarTemperatura() {
        return temperaturaCelsius;
    }

    public void setarTemperatura(double temperaturaEmCelsius) {
        this.temperaturaCelsius = temperaturaEmCelsius;
    }
}
