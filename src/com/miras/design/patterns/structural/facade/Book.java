package com.miras.design.patterns.structural.facade;

public class Book implements Readable {
    @Override
    public void read() {
        System.out.println("Reading book...");
    }
}
