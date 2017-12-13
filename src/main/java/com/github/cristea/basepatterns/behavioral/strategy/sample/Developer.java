package com.github.cristea.basepatterns.behavioral.strategy.sample;

/**
 * @author Victor Cristea.
 */
public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
