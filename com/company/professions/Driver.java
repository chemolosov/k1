package com.company.professions;

public class Driver extends Person {
    private String name;
    private int experiance;

    public Driver(String name, int experiance) {
        this.name = name;
        this.experiance = experiance;
    }

    public Driver(String fullName, int age, boolean retired, String name, int experiance) {
        super(fullName, age, retired);
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

}
