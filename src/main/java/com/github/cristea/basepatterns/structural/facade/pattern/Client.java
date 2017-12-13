package com.github.cristea.basepatterns.structural.facade.pattern;

/**
 * @author Victor Cristea.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startSystem();
    }
}
