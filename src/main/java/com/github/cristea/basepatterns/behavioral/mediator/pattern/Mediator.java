package com.github.cristea.basepatterns.behavioral.mediator.pattern;

/**
 * @author Victor Cristea.
 */
public interface Mediator {

    void addColleague(Colleague colleague);

    void update(Colleague colleague);

    void setData(String data);
}
