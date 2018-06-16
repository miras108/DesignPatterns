package com.miras.design.patterns.creational.singleton;

public class Singleton {

    private static Singleton singleton;
    private String value;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton("singletonValue");
        }
        return singleton;
    }

    private Singleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
