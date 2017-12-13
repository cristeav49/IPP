package com.github.cristea.basepatterns.structural.facade.pattern;

/**
 * @author Victor Cristea.
 */
public class Facade {
    private SubSystemOne subSystemOne = new SubSystemOne();
    private SubSystemTwo subSystemTwo = new SubSystemTwo();
    private SubSystemThree subSystemThree = new SubSystemThree();

    public void startSystem() {
        subSystemOne.method1();

        subSystemTwo.method1();
        subSystemTwo.method2();

        subSystemThree.method1();
        subSystemThree.method2();
        subSystemThree.method3();
    }
}
