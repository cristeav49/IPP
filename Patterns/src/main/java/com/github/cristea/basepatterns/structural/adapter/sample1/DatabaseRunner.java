package com.github.cristea.basepatterns.structural.adapter.sample1;

/**
 * @author Victor Cristea.
 */
public class DatabaseRunner {
    static Database database;

    public static void main(String[] args) {
        database = new AdapterJavaToDatabase();

        database.create();
        database.read();
        database.update();
        database.delete();
    }
}
