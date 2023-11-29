package org.builder;

import org.builder.builder.Car;
import org.builder.builder.CarBuilder;
import org.builder.builder.CarBuilderImpl;
import org.builder.director.CarDirector;

public class Main {
    // CLIENT
    public static void main(String[] args) {
        // ConcreteBuilder
        CarBuilder carBuilder = new CarBuilderImpl();
        // Director
        CarDirector carDirector = new CarDirector(carBuilder);

        // Product = objeto complexo construído
        Car car = carDirector.construct();
        System.out.println(car);
    }
}