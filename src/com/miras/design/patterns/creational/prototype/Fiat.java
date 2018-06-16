package com.miras.design.patterns.creational.prototype;

public class Fiat extends Car {
    private String name = "FIAT";
    private String country = "IT";
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
