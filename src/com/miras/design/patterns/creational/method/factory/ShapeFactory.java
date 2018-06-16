package com.miras.design.patterns.creational.method.factory;

public class ShapeFactory {
    public Shape getShape(String shapeName) {
        switch (shapeName) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                throw new UnsupportedOperationException("There is no factory method for shape: " + shapeName);
        }
    }
}
