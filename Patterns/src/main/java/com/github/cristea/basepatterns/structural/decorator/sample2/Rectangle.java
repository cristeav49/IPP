package com.github.cristea.basepatterns.structural.decorator.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
