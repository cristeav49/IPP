package com.github.cristea.basepatterns.creational.factorymethod.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteCreatorB extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
