package com.github.cristea.basepatterns.creational.builder.pattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Victor Cristea.
 */
public class BuilderTest {

    @Test
    public void testBuilder() {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        ObjectPart objectPart = director.construct();
        assertEquals("New object data", objectPart.getData());
    }
}