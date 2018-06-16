package com.miras.design.patterns.creational.abstractFactory;

public class Example {

    public static void main(String... args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = factoryProducer.getFactory("shape");
        Shape square = shapeFactory.getShape("square");
        Shape circle = shapeFactory.getShape("circle");
        square.draw();
        circle.draw();

        AbstractFactory colorFactory = factoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        Color blue = colorFactory.getColor("blue");
        red.fill();
        blue.fill();
    }
}
