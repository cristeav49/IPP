package com.github.cristea.basepatterns.behavioral.command.pattern;

/**
 * @author Victor Cristea.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Receiver receiver = new Receiver(new ConcreteCommand(invoker));
        receiver.action();
    }
}
