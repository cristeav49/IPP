package com.github.cristea.basepatterns.behavioral.command.pattern;

/**
 * @author Victor Cristea.
 */
public class Receiver {
    private Command command;

    public Receiver(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
