package com.github.cristea.basepatterns.creational.builder.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
