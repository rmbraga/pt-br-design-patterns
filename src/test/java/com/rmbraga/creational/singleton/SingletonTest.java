package com.rmbraga.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.nome = "Testing";

        Assertions.assertSame(singleton, singleton2);
        Assertions.assertEquals(singleton.nome, singleton2.nome);
    }
}
