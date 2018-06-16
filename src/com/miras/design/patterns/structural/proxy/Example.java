package com.miras.design.patterns.structural.proxy;

public class Example {
    public static void main(String... args) {
        FileProxy proxy = new FileProxy("file.txt");
        proxy.read();
        proxy.read();
    }
}
