package com.github.cristea.basepatterns.behavioral.observer.sample2;

/**
 * @author Victor Cristea.
 * @version 1.0
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
