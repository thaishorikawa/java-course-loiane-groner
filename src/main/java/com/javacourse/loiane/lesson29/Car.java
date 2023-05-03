package com.javacourse.loiane.lesson29;

public class Car {

    String brand;
    String model;
    int numPassengers;
    double fuelCapacity;
    double fuelConsumption;

    Car() {
        System.out.println("The car class has been instantiated");
        numPassengers = 4;
    }

    Car(String brand_, String model_, int numPassengers_, double fuelCapacity_) {
        brand = brand_;
        model = model_;
        numPassengers = numPassengers_;
        fuelCapacity = fuelCapacity_;

    }

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
