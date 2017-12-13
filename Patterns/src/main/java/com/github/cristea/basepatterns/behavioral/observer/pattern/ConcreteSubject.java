package com.github.cristea.basepatterns.behavioral.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Cristea.
 */
public class ConcreteSubject implements Subject {
    private String subjectState;
    private List<Observer> observers = new ArrayList<>();

    public ConcreteSubject(String subjectState) {
        this.subjectState = subjectState;
        System.out.println("Created subject with state: " + subjectState);
    }

    public void changeState(String state) {
        this.subjectState = state;
        notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(subjectState);
        }
    }
}
