package com.github.cristea.basepatterns.structural.proxy.sample1;

/**
 * @author Victor Cristea.
 */
public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    private void load() {
        System.out.println("Loading project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
