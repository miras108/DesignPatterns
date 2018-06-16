package com.miras.design.patterns.structural.composite;

public class Example {
    public static void main(String... args) {
        Directory root = new Directory("root");

        Directory firstSubDirectory = new Directory("firstSubDirectory");
        Directory secondSubDirectory = new Directory("secondSubDirectory");
        File firstFile = new File("firstFile");

        root.addFile(firstSubDirectory);
        root.addFile(secondSubDirectory);
        root.addFile(firstFile);

        Directory secondLevelDirectory = new Directory("secondLevelDirectory");
        File secondFile = new File("secondFile");
        File thirdFile = new File("thirdFile");
        File fourthFile = new File("fourthFile");

        firstSubDirectory.addFile(secondFile);
        secondSubDirectory.addFile(thirdFile);
        secondLevelDirectory.addFile(fourthFile);

        root.ls();
    }
}
