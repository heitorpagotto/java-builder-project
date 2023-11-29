package org.builder;

import org.builder.builder.Car;
import org.builder.builder.CarBuilder;
import org.builder.builder.CarBuilderImpl;
import org.builder.director.CarDirector;

public class Main {
    // CLIENT
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilderImpl();
        CarDirector carDirector = new CarDirector(carBuilder);

        Car car = carDirector.construct();
        System.out.println(car);
    }
}