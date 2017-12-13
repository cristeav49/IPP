package com.github.cristea.basepatterns.structural.adapter.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteAdapter extends Adaptee implements Adapter {
    @Override
    public void operation() {
        adaptedOperation();
    }
}
