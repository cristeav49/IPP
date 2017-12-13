package com.github.cristea.basepatterns.creational.abstractfactory.sample1.website;

import com.github.cristea.basepatterns.creational.abstractfactory.sample1.ProjectManager;

/**
 * @author Victor Cristea.
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
