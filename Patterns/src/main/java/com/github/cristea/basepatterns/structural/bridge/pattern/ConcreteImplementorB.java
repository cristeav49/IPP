package com.github.cristea.basepatterns.structural.bridge.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB performing operation...");
    }
}
