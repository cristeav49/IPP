package com.github.cristea.basepatterns.structural.bridge.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
