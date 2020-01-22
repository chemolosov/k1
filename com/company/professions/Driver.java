package com.company.professions;

import com.company.details.Engine;
import com.company.vehicles.Car;

public class Driver extends Car {
    private String name;
    private int experiance;

    public Driver(String carBrand, String carClass, double weight, Driver driver, Engine engine, String name, int experiance) {
        super(carBrand, carClass, weight, driver, engine);
        this.name = name;
        this.experiance = experiance;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", experiance=" + experiance +
                '}';
    }
}
