package com.github.cristea.basepatterns.behavioral.observer.sample1;

/**
 * @author Victor Cristea.
 */
public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
