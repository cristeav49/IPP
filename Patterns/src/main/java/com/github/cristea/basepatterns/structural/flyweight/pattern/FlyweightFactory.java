package com.github.cristea.basepatterns.structural.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Victor Cristea.
 */
public class FlyweightFactory {
    private static final Map<String, Flyweight> FLYWEIGHT_MAP = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = FLYWEIGHT_MAP.get(key);

        if (flyweight == null) {
            flyweight = new ConcreteFlyweight();
            FLYWEIGHT_MAP.put(key, flyweight);
        }

        return flyweight;
    }
}
