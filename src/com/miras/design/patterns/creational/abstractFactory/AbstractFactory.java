package com.miras.design.patterns.creational.abstractFactory;

public interface AbstractFactory {
    Shape getShape(String shape);

    Color getColor(String color);
}
