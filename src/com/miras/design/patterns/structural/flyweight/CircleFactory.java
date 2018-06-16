package com.miras.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {

    Map<String, Circle> colorToCircleMap = new HashMap<>();

    public Circle getCircle(String color) {
        return colorToCircleMap.computeIfAbsent(color, color1 -> {
            System.out.println("creating new circle!");
            return new Circle(color1);
        });
    }
}
