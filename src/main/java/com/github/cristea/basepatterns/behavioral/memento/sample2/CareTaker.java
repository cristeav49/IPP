package com.github.cristea.basepatterns.behavioral.memento.sample2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Cristea.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
