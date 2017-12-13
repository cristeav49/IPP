package com.github.cristea.basepatterns.creational.abstractfactory.sample1.website;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.Tester;

/**
 * @author Victor Cristea.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
