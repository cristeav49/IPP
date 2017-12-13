package com.github.cristea.basepatterns.creational.prototype.sample2;

/**
 * @author Victor Cristea. 13.12
 * @version 1.0
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
