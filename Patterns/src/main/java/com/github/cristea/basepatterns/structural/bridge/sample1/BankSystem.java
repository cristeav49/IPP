package com.github.cristea.basepatterns.structural.bridge.sample1;

/**
 * @author Victor Cristea.
 */
public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
