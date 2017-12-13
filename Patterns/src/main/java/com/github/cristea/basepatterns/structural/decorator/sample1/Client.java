package com.github.cristea.basepatterns.structural.decorator.sample1;

/**
 * @author Victor Cristea.
*/

public class Client {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
