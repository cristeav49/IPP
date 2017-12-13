package com.github.cristea.basepatterns.structural.decorator.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
