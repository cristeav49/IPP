package com.github.cristea.basepatterns.creational.abstractfactory.sample1.website;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.Developer;
import com.github.cristea.basepatterns.creational.abstractfactory.sample1.ProjectManager;
import com.github.cristea.basepatterns.creational.abstractfactory.sample1.ProjectTeamFactory;
import com.github.cristea.basepatterns.creational.abstractfactory.sample1.Tester;

/**
 * @author Victor Cristea.
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
