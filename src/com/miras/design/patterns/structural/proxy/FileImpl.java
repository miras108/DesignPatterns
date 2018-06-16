package com.miras.design.patterns.structural.proxy;

public class FileImpl implements File {

    private String fileName;

    public FileImpl(String fileName) {
        this.fileName = fileName;
        loadFromDisc();
    }

    @Override
    public void read() {
        System.out.println("Reading file... " + fileName);
    }

    private void loadFromDisc() {
        System.out.println("Loading file from disc: " + fileName);
    }
}
