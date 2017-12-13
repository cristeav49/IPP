package com.github.cristea.basepatterns.structural.facade.sample2;

/**
 * @author Victor Cristea.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
