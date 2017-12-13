package com.github.cristea.basepatterns.behavioral.memento.sample2;

/**
 * @author Victor Cristea.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
