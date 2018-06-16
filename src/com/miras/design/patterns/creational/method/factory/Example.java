package com.miras.design.patterns.creational.method.factory;

public class Example {

    public static void main(String... args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape triangle = shapeFactory.getShape("triangle");
        Shape circle = shapeFactory.getShape("circle");
        Shape square = shapeFactory.getShape("square");

        triangle.draw();
        circle.draw();
        square.draw();
    }
}
