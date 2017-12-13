package com.github.cristea.basepatterns.structural.decorator.pattern;

/**
 * @author Victor Cristea. 06.11
 */
public class ConcreteDecorator extends Decorator {

    private String addedState;

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        return "ConcreteDecorator operation.";
    }

    public void addedBehaviour() {
        addedState = "Changed addedState.";
    }
}
