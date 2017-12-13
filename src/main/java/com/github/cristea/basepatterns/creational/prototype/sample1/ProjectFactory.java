package com.github.cristea.basepatterns.creational.prototype.sample1;

/**
 * @author Victor Cristea.
 */
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
