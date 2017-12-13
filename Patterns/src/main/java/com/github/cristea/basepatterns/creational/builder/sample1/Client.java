package com.github.cristea.basepatterns.creational.builder.sample1;

/**
 * @author Victor Cristea.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
