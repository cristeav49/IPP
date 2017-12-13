package com.github.cristea.basepatterns.creational.builder.pattern;

/**
 * @author Victor Cristea.
 */
public interface Builder {

    void buildPart();

    ObjectPart getResult();
}
