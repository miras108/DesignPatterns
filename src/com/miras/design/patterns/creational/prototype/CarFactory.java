package com.miras.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static Map<String, Car> prototypesMap = new HashMap<>();

    static {
        prototypesMap.put("ford", new Ford());
        prototypesMap.put("fiat", new Fiat());
        prototypesMap.put("bmw", new BMW());
    }

    public Car getCar(String carName) {
        if (prototypesMap.containsKey(carName)) {
            return prototypesMap.get(carName).clone();
        }
        throw new UnsupportedOperationException("There is no prototype for car name: " + carName);
    }
}
