package com.github.cristea.basepatterns.creational.builder.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
