package com.github.cristea.basepatterns.creational.factorymethod.sample1;

import org.junit.Test;

import static com.github.cristea.basepatterns.creational.factorymethod.sample1.MainProgram.createDeveloperFactoryBySpeciality;
import static org.junit.Assert.assertEquals;

/**
 * @author Victor Cristea.
 */
public class MainProgramTest {

    @Test
    public void createJavaDeveloper() throws Exception {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        assertEquals(JavaDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void createCppDeveloper() throws Exception {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("c++");
        Developer developer = developerFactory.createDeveloper();
        assertEquals(CppDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void createPhpDeveloper() throws Exception {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();
        assertEquals(PhpDeveloper.class, developer.getClass());
        developer.writeCode();
    }

}