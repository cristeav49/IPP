package com.github.cristea.basepatterns.creational.abstractfactory.sample1.banking;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.Developer;
import com.github.cristea.basepatterns.creational.abstractfactory.sample1.ProjectManager;
import com.github.cristea.basepatterns.creational.abstractfactory.sample1.ProjectTeamFactory;
import com.github.cristea.basepatterns.creational.abstractfactory.sample1.Tester;

/**
 * @author Victor Cristea.
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
