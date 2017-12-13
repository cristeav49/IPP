package com.github.cristea.basepatterns.behavioral.observer.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update(String state) {
        this.observerState = state;
        System.out.println("State is updated: " + observerState);
    }
}
