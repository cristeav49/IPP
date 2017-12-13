package com.github.cristea.basepatterns.creational.abstractfactory.sample2;

/**
 * @author Victor Cristea.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choise) {

        if (choise.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (choise.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
