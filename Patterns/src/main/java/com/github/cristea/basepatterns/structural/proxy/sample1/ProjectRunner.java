package com.github.cristea.basepatterns.structural.proxy.sample1;

/**
 * @author Victor Cristea.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/cristea/BasePatterns");

        project.run();
    }
}
