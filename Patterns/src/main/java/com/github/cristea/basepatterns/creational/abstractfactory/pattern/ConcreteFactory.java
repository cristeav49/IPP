package com.github.cristea.basepatterns.creational.abstractfactory.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteFactory implements AbstractFactory {
    @Override
    public AbstractProduct createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public AbstractProduct createProductB() {
        return new ConcreteProductB();
    }
}
