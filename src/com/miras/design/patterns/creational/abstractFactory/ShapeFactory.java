package com.miras.design.patterns.creational.abstractFactory;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new UnsupportedOperationException("Unsupported shape: " + shape);
        }
    }

    @Override
    public Color getColor(String color) {
        throw new UnsupportedOperationException("getColor method is not supported under ShapeFactory");
    }
}
