package com.miras.design.patterns.structural.flyweight;

public class Circle {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public Circle setX(int x) {
        this.x = x;
        return this;
    }

    public Circle setY(int y) {
        this.y = y;
        return this;
    }

    public Circle setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    public void print() {
        System.out.println("circle with color: " + color + " with point: (" + x + "," + y + ") with radius: " + radius);
    }
}
