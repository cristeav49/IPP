package com.github.cristea.basepatterns.creational.builder.pattern;

/**
 * @author Victor Cristea.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public ObjectPart construct() {
        builder.buildPart();

        return builder.getResult();
    }
}
