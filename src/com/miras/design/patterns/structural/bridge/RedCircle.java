package com.miras.design.patterns.structural.bridge;

public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing RED circle with parameters P(" + x + "," + y + "), radius=" + radius);
    }
}
