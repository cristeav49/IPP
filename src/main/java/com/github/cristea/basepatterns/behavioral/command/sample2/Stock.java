package com.github.cristea.basepatterns.behavioral.command.sample2;

/**
 * @author Victor Cristea.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] sold");
    }
}
