package com.github.cristea.basepatterns.creational.builder.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
