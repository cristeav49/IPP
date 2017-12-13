package com.github.cristea.basepatterns.behavioral.memento.pattern;

/**
 * @author Victor Cristea.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // save state
    public Memento createMemento() {
        return new Memento(state);
    }

    // restore state
    public void setMemento(Memento m) {
        this.state = m.getState();
    }
}
