package com.github.cristea.basepatterns.creational.builder.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
