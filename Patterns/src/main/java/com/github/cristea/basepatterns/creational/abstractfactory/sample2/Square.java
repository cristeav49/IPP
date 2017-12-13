package com.github.cristea.basepatterns.creational.abstractfactory.sample2;

/**
 * @author Victor Cristea.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
