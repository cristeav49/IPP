package com.github.cristea.basepatterns.structural.bridge.sample1;

/**
 * @author Victor Cristea.
 */
public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writing C++ code...");
    }
}
