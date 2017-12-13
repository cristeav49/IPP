package com.github.cristea.basepatterns.behavioral.memento.pattern;

/**
 * @author Victor Cristea.
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
