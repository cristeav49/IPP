package com.github.cristea.basepatterns.structural.bridge.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
