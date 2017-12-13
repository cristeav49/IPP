package com.github.cristea.basepatterns.creational.prototype.sample1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Victor Cristea.
 */
public class PrototypeTest {

    @Test
    public void comparePrototypeToOriginalObject() {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        assertEquals(master.getId(), masterClone.getId());
        assertEquals(master.getProjectName(), masterClone.getProjectName());
        assertEquals(master.getSourceCode(), masterClone.getSourceCode());

        assertNotEquals(master.hashCode(), masterClone.hashCode());
    }
}