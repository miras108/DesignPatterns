package com.miras.design.patterns.structural.adapter;

public class Rectangle {
    public void draw(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        System.out.println("Drawing rectangle with points P1(" + x1 + "," + y1 + "), P2(" + x2 + "," + y2 + ")" +
                "), P3(" + x3 + "," + y3 + "), P4(" + x4 + "," + y4 + ")");
    }
}
