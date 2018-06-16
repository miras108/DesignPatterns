package com.miras.design.patterns.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singleton;
    private static Object mutex = new Object();
    private String value;

    public static ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            synchronized (mutex) {
                if (singleton == null) {
                    singleton = new ThreadSafeSingleton("Thread safe singleton");
                }
            }
        }
        return singleton;
    }

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
