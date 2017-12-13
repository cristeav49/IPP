package com.github.cristea.basepatterns.behavioral.memento.pattern;

/**
 * @author Victor Cristea.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.createMemento());

        originator.setState("off");
        System.out.printf("State is %s\n", originator.getState());

        originator.setMemento(caretaker.getMemento());
        System.out.printf("State is %s\n", originator.getState());
    }
}
