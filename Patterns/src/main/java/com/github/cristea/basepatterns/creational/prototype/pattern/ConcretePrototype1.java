package com.github.cristea.basepatterns.creational.prototype.pattern;

/**
 * @author Victor Cristea.
 */
public class ConcretePrototype1 implements Prototype {
    private int id;
    private String name;

    public ConcretePrototype1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        ConcretePrototype1 copy = new ConcretePrototype1(id, name);
        return copy;
    }
}
