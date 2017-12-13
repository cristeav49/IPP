package com.github.cristea.basepatterns.creational.abstractfactory.sample1;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.banking.BankingTeamFactory;

/**
 * @author Victor Cristea.
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankingTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager projectManager = factory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
