package com.github.cristea.basepatterns.behavioral.command.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcreteCommand implements Command {
    Invoker invoker;

    public ConcreteCommand(Invoker invoker) {
        this.invoker = invoker;
    }

    @Override
    public void execute() {
        invoker.executeConcreteCommand();
    }
}
