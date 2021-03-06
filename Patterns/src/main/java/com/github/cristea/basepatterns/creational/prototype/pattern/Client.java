package com.github.cristea.basepatterns.creational.prototype.pattern;

/**
 * @author Victor Cristea.
 */
public class Client {
    private Prototype prototype;

    private void makeAction1() {
        Prototype object = new ConcretePrototype1(1, "Prototype One");
        System.out.println(object);

        prototype = (Prototype) object.clone();
        System.out.println(prototype);
    }

    private void makeAction2() {
        Prototype object = new ConcretePrototype2(123, "Second value");
        System.out.println(object);

        prototype = (Prototype) object.clone();
        System.out.println(prototype);
    }


    public static void main(String[] args) {
        new Client().makeAction1();
        new Client().makeAction2();
    }

}
