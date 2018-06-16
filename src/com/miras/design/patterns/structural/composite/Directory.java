package com.miras.design.patterns.structural.composite;

import java.util.ArrayList;

public class Directory implements AbstractFile {

    private String fileName;
    private ArrayList<AbstractFile> files = new ArrayList<>();

    public Directory(String fileName) {
        this.fileName = fileName;
    }

    public void addFile(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void ls() {
        System.out.println(fileName + "\\");
        files.forEach(file -> {
            System.out.print("\t");
            file.ls();
        });
    }
}
