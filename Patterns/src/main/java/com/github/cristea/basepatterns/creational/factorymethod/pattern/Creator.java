package com.github.cristea.basepatterns.creational.factorymethod.pattern;

/**
 * @author Victor Cristea.
 */
public class Creator {

    Product product;

    public Product factoryMethod() {
        return null;
    }

    public void anOperation() {
        product = factoryMethod();
    }
}
