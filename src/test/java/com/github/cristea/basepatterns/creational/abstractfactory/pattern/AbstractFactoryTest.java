package com.github.cristea.basepatterns.creational.abstractfactory.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Victor Cristea.
 */
public class AbstractFactoryTest {

    private Client client;

    @Test
    public void createProductA() throws Exception {
        client = new Client();
        assertEquals(ConcreteProductA.class, client.getProductA().getClass());
    }

    @Test
    public void createProductB() throws Exception {
        client = new Client();
        assertEquals(ConcreteProductB.class, client.getProductB().getClass());
    }

}