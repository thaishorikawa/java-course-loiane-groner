package com.javacourse.loiane.lesson27.review;

public class LightBulb {

    String model;
    int wattage;
    int lumen;
    String color;
    int voltage;
    int lifespanHours;
    String[] types;

    boolean on;

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    void showStatus() {
        if (on) {
            System.out.println("The light bulb is turned on.");
        } else {
            System.out.println("The light bulb is turned off.");
        }
    }

    void changeStatus() {
        if (on) {
            turnOff();
        } else {
            turnOn();
        }
    }

}
