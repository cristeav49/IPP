package com.github.cristea.basepatterns.structural.flyweight.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation() {
        System.out.println("Do something...");
    }
}
