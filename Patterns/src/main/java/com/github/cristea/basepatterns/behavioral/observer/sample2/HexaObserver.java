package com.github.cristea.basepatterns.behavioral.observer.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
