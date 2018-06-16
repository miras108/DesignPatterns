package com.miras.design.patterns.creational.abstractFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String choice) {
        switch (choice) {
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
            default:
                throw new UnsupportedOperationException("Unsupported factory for type: " + choice);
        }
    }
}
