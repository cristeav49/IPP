package com.github.cristea.basepatterns.structural.bridge.sample1;

/**
 * @author Victor Cristea.
 */
public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
