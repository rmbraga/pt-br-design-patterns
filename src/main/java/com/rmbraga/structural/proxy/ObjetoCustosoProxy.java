package com.rmbraga.structural.proxy;

public class ObjetoCustosoProxy implements ObjetoCustoso {
    private static ObjetoCustoso objetoCustoso;

    @Override
    public void processo() {
        if (objetoCustoso == null) {
            objetoCustoso = new ObjetoCustosoImpl();
            objetoCustoso.processo();
        }
    }
}
