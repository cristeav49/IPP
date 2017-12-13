package com.github.cristea.basepatterns.behavioral.strategy.pattern;

/**
 * @author Victor Cristea.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
