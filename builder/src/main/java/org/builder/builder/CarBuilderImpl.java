package org.builder.builder;

public class CarBuilderImpl implements CarBuilder {
    // ConcreteBuilder
    private String brand;
    private String model;
    private String color;
    private int year;

    @Override
    public CarBuilder buildBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder buildModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder buildColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder buildYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public Car build() {
        return new Car(brand, model, color, year);
    }
}
