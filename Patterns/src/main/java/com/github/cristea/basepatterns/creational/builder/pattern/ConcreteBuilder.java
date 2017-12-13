package com.github.cristea.basepatterns.creational.builder.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteBuilder implements Builder {

    private ObjectPart objectPart;

    @Override
    public void buildPart() {
        objectPart = new ObjectPart("New object data");
    }

    @Override
    public ObjectPart getResult() {
        return objectPart;
    }
}
