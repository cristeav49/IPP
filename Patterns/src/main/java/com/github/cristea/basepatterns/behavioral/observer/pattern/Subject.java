package com.github.cristea.basepatterns.behavioral.observer.pattern;

/**
 * @author Victor Cristea.
 */
public interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyObservers();
}
