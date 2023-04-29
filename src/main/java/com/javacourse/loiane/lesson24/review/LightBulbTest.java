package com.javacourse.loiane.lesson24.review;

public class LightBulbTest {

    public static void main(String[] args) {

        LightBulb lightBulb = new LightBulb();
        lightBulb.model = "A19";
        lightBulb.wattage = 9;
        lightBulb.lumen = 800;
        lightBulb.color = "Soft white";
        lightBulb.voltage = 120;
        lightBulb.lifespanHours = 25000;

        lightBulb.types = new String[5];
        lightBulb.types[0] = "Table lamp";
        lightBulb.types[1] = "Floor lamp";

    }
}
