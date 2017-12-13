package com.github.cristea.basepatterns.behavioral.command.sample1;

/**
 * @author Victor Cristea.
 */
public class UpdateCommand implements Command {
    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
