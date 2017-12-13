package com.github.cristea.basepatterns.creational.factorymethod.sample1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Victor Cristea.
 */
public class DeveloperTest {

    @Test
    public void javaDeveloperTest() throws Exception {
        Developer developer = new JavaDeveloper();
        assertEquals(JavaDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void cppDeveloperTest() throws Exception {
        Developer developer = new CppDeveloper();
        assertEquals(CppDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void phpDeveloperTest() throws Exception {
        Developer developer = new PhpDeveloper();
        assertEquals(PhpDeveloper.class, developer.getClass());
        developer.writeCode();
    }
}