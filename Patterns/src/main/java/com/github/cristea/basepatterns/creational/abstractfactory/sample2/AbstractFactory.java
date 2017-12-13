package com.github.cristea.basepatterns.creational.abstractfactory.sample2;

/**
 * @author Victor Cristea.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
