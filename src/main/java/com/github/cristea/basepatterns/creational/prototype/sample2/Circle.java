package com.github.cristea.basepatterns.creational.prototype.sample2;

/**
 * @author Victor Cristea. 13.12
 * @version 1.0
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
