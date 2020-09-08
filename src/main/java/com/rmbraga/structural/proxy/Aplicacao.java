package com.rmbraga.structural.proxy;

public class Aplicacao {
    public static void main(String[] args) {
        ObjetoCustoso object = new ObjetoCustosoProxy();
        object.processo();
        object.processo();
    }
}
