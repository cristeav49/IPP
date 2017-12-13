package com.github.cristea.basepatterns.structural.adapter.sample1;

/**
 * @author Victor Cristea.
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void create() {
        createObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
