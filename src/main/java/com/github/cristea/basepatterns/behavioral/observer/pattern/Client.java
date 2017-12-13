package com.github.cristea.basepatterns.behavioral.observer.pattern;

/**
 * @author Victor Cristea.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("On");
        Observer observer = new ConcreteObserver();

        subject.attach(observer);

        subject.changeState("Waiting");
        subject.changeState("Off");
    }
}
