package com.github.cristea.basepatterns.creational.abstractfactory.sample1.banking;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.Developer;

/**
 * @author Victor Cristea.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
