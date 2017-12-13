package com.github.cristea.basepatterns.structural.decorator.pattern;

/**
 * @author Victor Cristea.*/

public class Decorator implements Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return component.operation();
    }
}
