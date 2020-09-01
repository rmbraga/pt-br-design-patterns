package com.rmbraga.structural.adapter;

import static java.lang.Math.round;

// Classe Adaptador(adapter) que utiliza a herança da classe adaptada(adaptee) e implementa os métodos da interface.
public class TemperaturaAdaptador extends MedidorCelsius implements TemperaturaInfo {
    @Override
    public double retornarTemperaturaCelcius() {
        return temperaturaCelsius;
    }

    @Override
    public double retornarTemperaturaFahrenheit() {
        return celciusToFahrenheit(temperaturaCelsius);
    }

    @Override
    public void setarTemperaturaCelcius(double temperaturaCelcius) {
        this.temperaturaCelsius = temperaturaCelcius;
    }

    @Override
    public void setarTemperaturaFahrenheit(double temperaturaFahrenheit) {
        this.temperaturaCelsius = fahrenheitToCelcius(temperaturaFahrenheit);
    }

    private double fahrenheitToCelcius(double f) {
        return round((f - 32) * 5 / 9);
    }

    private double celciusToFahrenheit(double c) {
        return round((c * 9 / 5) + 32);
    }
}
