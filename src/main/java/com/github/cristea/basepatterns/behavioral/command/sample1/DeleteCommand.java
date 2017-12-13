package com.github.cristea.basepatterns.behavioral.command.sample1;

/**
 * @author Victor Cristea.
 */
public class DeleteCommand implements Command {
    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
