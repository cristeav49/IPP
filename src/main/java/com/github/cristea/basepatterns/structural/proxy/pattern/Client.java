package com.github.cristea.basepatterns.structural.proxy.pattern;

/**
 * @author Victor Cristea.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();

        subject.request();
    }
}
