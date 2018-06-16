package com.miras.design.patterns.structural.adapter;

public class RectangleAdapter implements Shape {

    private Rectangle adaptee;

    public RectangleAdapter(Rectangle adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw(int x, int y, int w, int h) {
        int x1 = x;
        int y1 = y;

        int x2 = x + w;
        int y2 = y;

        int x3 = x2;
        int y3 = y2 + h;

        int x4 = x1;
        int y4 = y1 + h;

        adaptee.draw(x1, x2, x3, x4, y1, y2, y3, y4);
    }
}
