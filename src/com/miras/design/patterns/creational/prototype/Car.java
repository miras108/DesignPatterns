package com.miras.design.patterns.creational.prototype;

public abstract class Car implements Cloneable {

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract String getName();

    public abstract String getCountry();

    public abstract String getModel();

    public abstract void setModel(String model);
}
