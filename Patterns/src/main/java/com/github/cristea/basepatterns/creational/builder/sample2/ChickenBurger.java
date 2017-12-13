package com.github.cristea.basepatterns.creational.builder.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
