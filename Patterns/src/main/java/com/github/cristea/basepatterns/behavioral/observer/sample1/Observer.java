package com.github.cristea.basepatterns.behavioral.observer.sample1;

import java.util.List;

/**
 * @author Victor Cristea.
 */
public interface Observer {
    void handleEvent(List<String> vacancies);
}
