package com.company;

public class Car extends Vehicle {

    private String typeOfCar;

    public Car(int wheels, int engine, String typeOfCar) {
        super(wheels, 1, 1, engine );
        this.typeOfCar = typeOfCar;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }
}
