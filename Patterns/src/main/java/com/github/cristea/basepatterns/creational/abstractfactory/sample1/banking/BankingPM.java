package com.github.cristea.basepatterns.creational.abstractfactory.sample1.banking;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.ProjectManager;

/**
 * @author Victor Cristea.
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
