package com.github.cristea.basepatterns.structural.bridge.sample1;

/**
 * @author Victor Cristea.
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
