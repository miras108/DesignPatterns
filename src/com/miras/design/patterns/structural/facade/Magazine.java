package com.miras.design.patterns.structural.facade;

public class Magazine implements Readable {
    @Override
    public void read() {
        System.out.println("Reading magazine...");
    }
}
