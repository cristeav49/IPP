package com.github.cristea.basepatterns.behavioral.strategy.sample;

/**
 * @author Victor Cristea.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
