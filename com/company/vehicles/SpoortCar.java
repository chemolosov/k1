package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

public class SpoortCar extends Car {
    private double sped;

    public SpoortCar(String carBrand, String carClass, double weight, Driver driver, Engine engine, double sped) {
        super(carBrand, carClass, weight, driver, engine);
        this.sped = sped;
    }



    public double getSped() {
        return sped;
    }

    public void setSped(double sped) {
        this.sped = sped;
    }
}
