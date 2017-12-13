package com.github.cristea.basepatterns.structural.proxy.pattern;

/**
 * @author Victor Cristea.
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        System.out.println("Created Proxy.");
    }

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
