package com.github.cristea.basepatterns.creational.factorymethod.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Victor Cristea.
 */
public class FactoryMethodTest {

    private Creator creator;

    @Test
    public void createProductA() throws Exception {
        creator = new ConcreteCreatorA();
        creator.anOperation();
        assertEquals(ConcreteProductA.class, creator.product.getClass());
    }

    @Test
    public void createProductB() throws Exception {
        creator = new ConcreteCreatorB();
        creator.anOperation();
        assertEquals(ConcreteProductB.class, creator.product.getClass());
    }

}