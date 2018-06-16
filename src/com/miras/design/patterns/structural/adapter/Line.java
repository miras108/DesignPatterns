package com.miras.design.patterns.structural.adapter;

public class Line {
    public void draw(int x1, int x2, int y1, int y2) {
        System.out.println("Drawing line with points P1(" + x1 + "," + y1 + "), P2(" + x2 + "," + y2 + ")");
    }
}
