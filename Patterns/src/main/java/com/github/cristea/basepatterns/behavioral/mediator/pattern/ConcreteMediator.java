package com.github.cristea.basepatterns.behavioral.mediator.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Cristea.
 */
public class ConcreteMediator implements Mediator {
    private String data;
    private List<Colleague> colleagueList = new ArrayList<>();

    public List<Colleague> getColleagueList() {
        return colleagueList;
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagueList.add(colleague);
    }

    @Override
    public void update(Colleague colleague) {
        colleague.setData(data);
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ConcreteMediator{" +
                "colleagueList=" + colleagueList +
                '}';
    }
}
