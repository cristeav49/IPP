package com.github.cristea.basepatterns.structural.bridge.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
