package com.github.cristea.basepatterns.creational.prototype.sample2;

/**
 * @author Victor Cristea. 13.12
 * @version 1.0
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
