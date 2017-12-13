package com.github.cristea.basepatterns.structural.bridge.sample1;

/**
 * @author Victor Cristea.
 */
public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
