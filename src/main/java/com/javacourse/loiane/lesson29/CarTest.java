package com.javacourse.loiane.lesson29;

public class CarTest {

    public static void main(String[] args) {

        Car van = new Car();

        van.brand = "Fiat";
        van.model = "Ducato";
        van.numPassengers = 10;
        van.fuelCapacity = 100;
        van.fuelConsumption = 0.2;

        Car van2 = new Car("Fiat", "Ducato", 10, 100);

        System.out.println(van2.brand);
        System.out.println(van2.model);
        System.out.println(van2.numPassengers);
        System.out.println(van2.fuelCapacity);
    }
}
