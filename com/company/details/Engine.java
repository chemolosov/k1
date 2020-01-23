package com.company.details;

import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Engine extends Car {
    private int power;
    private String company;

    public Engine(String carBrand, String carClass, double weight, Driver driver, Engine engine, int power, String company) {
        super(carBrand, carClass, weight, driver, engine);
        this.power = power;
        this.company = company;
    }




    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
