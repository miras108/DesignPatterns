package com.miras.design.patterns.structural.decorator;

public class BorderDecorator extends ShapeDecorator {

    public BorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.println("\n");
        decoratedShape.draw();
        System.out.println("With Border");
    }
}
