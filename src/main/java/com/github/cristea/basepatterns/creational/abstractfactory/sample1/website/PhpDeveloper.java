package com.github.cristea.basepatterns.creational.abstractfactory.sample1.website;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.Developer;

/**
 * @author Victor Cristea.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
