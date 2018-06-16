package com.miras.design.patterns.creational.prototype;

public class Example {
    public static void main(String... args) {
        CarFactory carFactory = new CarFactory();

        Car fiat = carFactory.getCar("fiat");
        Car ford = carFactory.getCar("ford");
        Car bmw = carFactory.getCar("bmw");

        System.out.println("Car: " + fiat.getName() + ", Country: " + fiat.getCountry());
        System.out.println("Car: " + ford.getName() + ", Country: " + ford.getCountry());
        System.out.println("Car: " + bmw.getName() + ", Country: " + bmw.getCountry());
    }
}
