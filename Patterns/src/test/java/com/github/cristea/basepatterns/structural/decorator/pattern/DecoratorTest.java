package com.github.cristea.basepatterns.structural.decorator.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Victor Cristea. 06.11
 */
public class DecoratorTest {

    @Test
    public void createComponent() {
        Component component = new ConcreteComponent();
        assertEquals("ConcreteComponent operation.", component.operation());
    }

    @Test
    public void createDecoratedComponent() {
        Component component = new ConcreteComponent();
        Component decorator = new ConcreteDecorator(component);
        assertEquals("ConcreteDecorator operation.", decorator.operation());
    }
}