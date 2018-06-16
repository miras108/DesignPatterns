package com.miras.design.patterns.structural.flyweight;

public class Example {

    private static String[] colors = {"red", "blue", "yelow", "purple", "black"};

    public static void main(String... args) {
        CircleFactory circleFactory = new CircleFactory();

        for (int i = 0; i < 20; i++) {
            Circle circle = circleFactory.getCircle(getRandomColor());
            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 100));
            circle.setRadius((int) (Math.random() * 10));
            circle.print();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

}
