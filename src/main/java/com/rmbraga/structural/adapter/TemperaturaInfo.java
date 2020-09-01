package com.rmbraga.structural.adapter;

// Interface-alvo. Os métodos aqui presentes seraão implementados pela classe adaptador(adapter).
public interface TemperaturaInfo {
    double retornarTemperaturaFahrenheit();

    void setarTemperaturaFahrenheit(double temperaturaFahrenheit);

    double retornarTemperaturaCelcius();

    void setarTemperaturaCelcius(double temperaturaCelcius);
}
