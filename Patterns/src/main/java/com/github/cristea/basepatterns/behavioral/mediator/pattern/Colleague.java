package com.github.cristea.basepatterns.behavioral.mediator.pattern;

/**
 * @author Victor Cristea.
 */
public interface Colleague {

    void inform(String message, Mediator mediator);

    void setData(String data);
}
