package com.rmbraga.structural.adapter;

public class Aplicacao {
    public static void main(String[] args) {
        System.out.println("==== Teste do Adaptador ====");
        TemperaturaInfo tempInfo = new TemperaturaAdaptador();
        testTempInfo(tempInfo);
        // object adapter
        System.out.println("\n== Teste do Objeto Adaptador ==");
        tempInfo = new TemperaturaObjetoAdaptador();
        testTempInfo(tempInfo);
    }

    public static void testTempInfo(TemperaturaInfo tempInfo) {
        tempInfo.setarTemperaturaCelcius(0);
        System.out.println("Temperatura em Celcius    : " + tempInfo.retornarTemperaturaCelcius());
        System.out.println("Temperatura em Fahrenheit : " + tempInfo.retornarTemperaturaFahrenheit());
        tempInfo.setarTemperaturaFahrenheit(87);
        System.out.println("Temperatura em Celcius    : " + tempInfo.retornarTemperaturaCelcius());
        System.out.println("Temperatura em Fahrenheit : " + tempInfo.retornarTemperaturaFahrenheit());
    }
}
