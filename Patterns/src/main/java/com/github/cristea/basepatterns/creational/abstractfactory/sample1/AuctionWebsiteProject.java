package com.github.cristea.basepatterns.creational.abstractfactory.sample1;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.website.WebsiteTeamFactory;

/**
 * @author Victor Cristea.
 */
public class AuctionWebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new WebsiteTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager projectManager = factory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
