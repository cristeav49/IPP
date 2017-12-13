package com.github.cristea.basepatterns.behavioral.memento.sample1;

import java.util.Date;

/**
 * @author Victor Cristea.
 */
public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
