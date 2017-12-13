package com.github.cristea.basepatterns.creational.abstractfactory.sample1;

/**
 * @author Victor Cristea.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
