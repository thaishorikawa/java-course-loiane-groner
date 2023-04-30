package com.javacourse.loiane.lesson27;

public class Car {

    String brand;
    String model;
    int numPassengers;
    double fuelCapacity;
    double fuelConsumption;

    void displayRange() {
        System.out.println("The car range is: " + fuelCapacity * fuelConsumption + " km");
    }

    double obtainCarRange() {

        System.out.println("Obtain car range method: ");
        return fuelCapacity * fuelConsumption;
    }

    double calculateFuel(double km) {

        double qtFuel = km / fuelConsumption;

        return qtFuel;
    }
}
