package com.miras.design.patterns.structural.proxy;

public class FileProxy implements File {
    private File file;
    private String fileName;

    public FileProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void read() {
        if (this.file == null) {
            file = new FileImpl(fileName);
        }
        file.read();
    }
}
