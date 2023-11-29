package org.builder.builder;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;

    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Carro {" +
                "marca='" + brand + '\'' +
                ", modelo='" + model + '\'' +
                ", cor='" + color + '\'' +
                ", ano=" + year +
                '}';
    }
}
