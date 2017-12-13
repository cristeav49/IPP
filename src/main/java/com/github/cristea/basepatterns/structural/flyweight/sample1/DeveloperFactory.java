package com.github.cristea.basepatterns.structural.flyweight.sample1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Victor Cristea.
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "php":
                    System.out.println("Hiring PHP developer...");
                    developer = new PhpDeveloper();
            }
            developers.put(speciality, developer);
        }

        return developer;
    }
}
