package com.github.cristea.basepatterns.structural.bridge.pattern;

/**
 * @author Victor Cristea.
 */
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
