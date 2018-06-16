package com.miras.design.patterns.structural.composite;

public class File implements AbstractFile {

    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    @Override
    public void ls() {
        System.out.println(filename);
    }
}
