package org.builder.builder;

public interface CarBuilder {
    CarBuilder buildBrand(String brand);
    CarBuilder buildModel(String model);
    CarBuilder buildColor(String color);
    CarBuilder buildYear(int year);
    Car build();
}
