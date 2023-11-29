package org.builder.director;

import org.builder.builder.Car;
import org.builder.builder.CarBuilder;

public class CarDirector {
    private CarBuilder carBuilder;
    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    public Car construct() {
        return carBuilder
                .buildBrand("Fiat")
                .buildModel("Uno")
                .buildColor("Prata")
                .buildYear(2006)
                .build();
    }
}
