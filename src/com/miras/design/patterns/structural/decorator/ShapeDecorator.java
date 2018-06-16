package com.miras.design.patterns.structural.decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    protected ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
}
