package com.github.cristea.basepatterns.creational.builder.pattern;

/**
 * @author Victor Cristea.
 */
public class ObjectPart {
    private String objectPartData;

    public ObjectPart(String objectPartData) {
        this.objectPartData = objectPartData;
    }

    public String getData() {
        return objectPartData;
    }
}
