package com.github.cristea.basepatterns.structural.decorator.sample1;

/**
 * @author Victor Cristea.
 * */

public class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
