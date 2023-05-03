package com.javacourse.loiane.lesson30;

public class Car {

    String brand;
    String model;
    int numPassengers;
    double fuelCapacity;
    double fuelConsumption;


    public Car(String brand, String model, int numPassengers, double fuelCapacity, double fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.numPassengers = numPassengers;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public Car() {
    }

    public Car(String brand, String model, int numPassengers) {
        this.brand = brand;
        this.model = model;
        this.numPassengers = numPassengers;
        System.out.println("Constructor with 3 parameters.");
    }

    public Car(String brand, String model) {
        this(brand, model, 10);
        System.out.println("Constructor with 2 parameters");
    }

    void displayRange() {
        System.out.println("The car range is: " + this.fuelCapacity * this.fuelConsumption + " km");
    }

    double obtainCarRange() {

        System.out.println("Obtain car range method: ");
        return this.fuelCapacity * this.fuelConsumption;
    }

    double calculateFuel(double km) {

        double qtFuel = km / this.fuelConsumption;

        return qtFuel;
    }
}
