package com.github.cristea.basepatterns.behavioral.strategy.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing concrete strategy B...");
    }
}
