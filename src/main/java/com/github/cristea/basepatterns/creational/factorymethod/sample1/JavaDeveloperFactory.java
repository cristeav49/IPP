package com.github.cristea.basepatterns.creational.factorymethod.sample1;

/**
 * @author Victor Cristea.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
