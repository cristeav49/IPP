package com.github.cristea.basepatterns.structural.bridge.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA performing operation...");
    }
}
