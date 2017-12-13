package com.github.cristea.basepatterns.structural.adapter.pattern;

/**
 * @author Victor Cristea.
 */
public class Client {
    private static Adapter adapter;

    public static void main(String[] args) {
        adapter = new ConcreteAdapter();

        adapter.operation();
    }
}
