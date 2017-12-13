package com.github.cristea.basepatterns.structural.decorator.pattern;

/**
 * @author Victor Cristea. */

public class ConcreteComponent implements Component {
    @Override
    public String operation() {
        return "ConcreteComponent operation.";
    }
}
