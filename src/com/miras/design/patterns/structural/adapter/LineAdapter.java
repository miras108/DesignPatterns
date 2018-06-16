package com.miras.design.patterns.structural.adapter;

public class LineAdapter implements Shape {

    private Line adaptee;

    public LineAdapter(Line adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw(int a, int b, int c, int d) {
        adaptee.draw(a, c, b, d);
    }
}
