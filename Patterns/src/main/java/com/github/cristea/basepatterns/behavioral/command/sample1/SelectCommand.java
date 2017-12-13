package com.github.cristea.basepatterns.behavioral.command.sample1;

/**
 * @author Victor Cristea.
 */
public class SelectCommand implements Command {
    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
