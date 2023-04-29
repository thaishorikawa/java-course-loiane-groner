package com.javacourse.loiane.lesson25;

public class Car {

    String brand;
    String model;
    int numPassengers;
    double fuelCapacity;
    double fuelConsumption;

    void displayRange() {
        System.out.println("The car range is: " + fuelCapacity * fuelConsumption + " km");
    }
}
