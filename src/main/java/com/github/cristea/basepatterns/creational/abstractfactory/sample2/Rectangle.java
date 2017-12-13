package com.github.cristea.basepatterns.creational.abstractfactory.sample2;

/**
 * @author Victor Cristea.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
