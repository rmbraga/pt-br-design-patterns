package com.rmbraga.structural.adapter;

import static java.lang.Math.round;

/*
* Classe objeto adaptador(object adapter).
* Porém, utiliza composição ao invés da herança utilizada no adaptador(adapter) - TemperaturaAdaptador
* */
public class TemperaturaObjetoAdaptador implements TemperaturaInfo {
    /* Wrapper (embrulha) medidor por composição em seu objeto */
    MedidorCelsius medidorCelsius;

    public TemperaturaObjetoAdaptador() {
        medidorCelsius = new MedidorCelsius();
    }

    @Override
    public double retornarTemperaturaCelcius() {
        return medidorCelsius.retornarTemperatura();
    }

    @Override
    public double retornarTemperaturaFahrenheit() {
        return celciusToFahrenheit(medidorCelsius.retornarTemperatura());
    }

    @Override
    public void setarTemperaturaCelcius(double temperaturaCelcius) {
        medidorCelsius.setarTemperatura(temperaturaCelcius);
    }

    @Override
    public void setarTemperaturaFahrenheit(double temperaturaFahrenheit) {
        medidorCelsius.setarTemperatura(fahrenheitToCelcius(temperaturaFahrenheit));
    }

    private double fahrenheitToCelcius(double f) {
        return round((f - 32) * 5 / 9);
    }

    private double celciusToFahrenheit(double c) {
        return round((c * 9 / 5) + 32);
    }
}
