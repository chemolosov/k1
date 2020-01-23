package com.company.vehicles;

import com.company.professions.Driver;
import com.company.details.Engine;

public class Lorry extends  Car{
    private int carring;

    public Lorry(String carBrand, String carClass, double weight, Driver driver, Engine engine, int carring) {
        super(carBrand, carClass, weight, driver, engine);
        this.carring = carring;
    }



    public int getCarring() {
        return carring;
    }

    public void setCarring(int carring) {
        this.carring = carring;
    }
}
