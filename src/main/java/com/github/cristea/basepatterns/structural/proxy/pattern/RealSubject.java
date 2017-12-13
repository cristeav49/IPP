package com.github.cristea.basepatterns.structural.proxy.pattern;

/**
 * @author Victor Cristea.
 */
public class RealSubject implements Subject {
    public RealSubject() {
        System.out.println("Created RealSubject.");
    }

    @Override
    public void request() {
        System.out.println("RealProject is making request...");
    }
}
