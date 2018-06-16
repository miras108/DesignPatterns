package com.miras.design.patterns.structural.bridge;

import java.util.List;

import static java.util.Arrays.asList;

public class Example {
    public static void main(String... args) {
        List<Shape> shapes = asList(
                new Circle(new BlueCircle(), 1, 2, 15),
                new Circle(new RedCircle(), 3, 5, 20));

        shapes.forEach(Shape::draw);
    }
}
