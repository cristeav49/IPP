package com.github.cristea.basepatterns.creational.abstractfactory.sample1.banking;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.Tester;

/**
 * @author Victor Cristea.
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QATester tests banking code...");
    }
}
