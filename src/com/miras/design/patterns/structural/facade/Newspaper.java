package com.miras.design.patterns.structural.facade;

public class Newspaper implements Readable {
    @Override
    public void read() {
        System.out.println("Read newspaper");
    }
}
