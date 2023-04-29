package com.javacourse.loiane.lesson25;

public class CarTest {

    public static void main(String[] args) {

        Car van = new Car();
        van.brand = "Fiat";
        van.model = "Ducato";
        van.numPassengers = 10;
        van.fuelCapacity = 100;
        van.fuelConsumption = 0.2;

        System.out.println(van.brand);

        van.displayRange();
    }
}
