package com.github.cristea.basepatterns.creational.singleton.pattern;

/**
 * @author Victor Cristea.
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private String singletonData = "Singleton data";

    public static synchronized Singleton instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    private Singleton() {

    }

    public String singletonOperation() {
        return singletonData;
    }
}
