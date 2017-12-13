package com.github.cristea.basepatterns.behavioral.command.sample1;

/**
 * @author Victor Cristea.
 */
public class Database {
    public void insert() {
        System.out.println("Creating record...");
    }

    public void select() {
        System.out.println("Reading record...");
    }

    public void update() {
        System.out.println("Updating record...");
    }

    public void delete() {
        System.out.println("Deleting record...");
    }
}
