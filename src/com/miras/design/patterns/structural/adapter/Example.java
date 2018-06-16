package com.miras.design.patterns.structural.adapter;

import java.util.List;

import static java.util.Arrays.asList;

public class Example {

    public static void main(String... args) {
        List<Shape> shapes = asList(new LineAdapter(new Line()), new RectangleAdapter(new Rectangle()));

        int a = 1;
        int b = 1;
        int c = 2;
        int d = 2;

        shapes.forEach(shape -> shape.draw(a, b, c, d));
    }
}
