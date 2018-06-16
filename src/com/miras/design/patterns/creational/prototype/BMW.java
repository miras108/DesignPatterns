package com.miras.design.patterns.creational.prototype;

public class BMW extends Car {
    private String name = "BMW";
    private String country = "DE";
    private String model;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }
}
