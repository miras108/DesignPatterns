package com.miras.design.patterns.creational.abstractFactory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        throw new UnsupportedOperationException("getShape method is not supported under ColorFactory class");
    }

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            default:
                throw new UnsupportedOperationException("Unsupported color: " + color);
        }
    }
}
