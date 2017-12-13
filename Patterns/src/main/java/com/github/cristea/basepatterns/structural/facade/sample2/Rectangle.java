package com.github.cristea.basepatterns.structural.facade.sample2;

/**
 * @author Victor Cristea.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
