package com.github.cristea.basepatterns.behavioral.mediator.sample2;

import java.util.Date;

/**
 * @author Victor Cristea.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
