package com.miras.design.patterns.structural.decorator;

public class Example {
    public static void main(String... args) {
        Square decoratedSquare = new Square();
        Rectangle decoratedRectangle = new Rectangle();

        BorderDecorator square = new BorderDecorator(decoratedSquare);
        BorderDecorator rectangle = new BorderDecorator(decoratedRectangle);

        decoratedRectangle.draw();
        rectangle.draw();

        decoratedSquare.draw();
        square.draw();
    }
}
