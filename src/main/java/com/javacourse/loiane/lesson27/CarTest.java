package com.javacourse.loiane.lesson27;

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

        double carRange = van.obtainCarRange();
        System.out.println("The car has a driving range of: " + carRange);
        System.out.println("The car has a driving range of: " + van.obtainCarRange());

        double qtFuel10 = van.calculateFuel(10);
        double qtFuel15 = van.calculateFuel(15);

        System.out.println("qtFuel10 = " + qtFuel10);
        System.out.println("qtFuel15 = " + qtFuel15);

    }
}
