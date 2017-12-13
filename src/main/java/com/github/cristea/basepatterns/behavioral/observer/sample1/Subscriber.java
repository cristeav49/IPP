package com.github.cristea.basepatterns.behavioral.observer.sample1;

import java.util.List;

/**
 * @author Victor Cristea.
 */
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies +
                "\n==================================================\n");
    }
}
