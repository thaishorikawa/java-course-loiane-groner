package com.javacourse.loiane.lesson33.review;

public class LightBulb {

    private String model;
    private int wattage;
    private int lumen;
    private String color;
    private int voltage;
    private int lifespanHours;
    private String[] types;
    private boolean on;

    public LightBulb() {
    }

    public LightBulb(String model, int wattage, int lumen, String color, int voltage, int lifespanHours, String[] types, boolean on) {
        this.model = model;
        this.wattage = wattage;
        this.lumen = lumen;
        this.color = color;
        this.voltage = voltage;
        this.lifespanHours = lifespanHours;
        this.types = types;
        this.on = on;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getLumen() {
        return lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getLifespanHours() {
        return lifespanHours;
    }

    public void setLifespanHours(int lifespanHours) {
        this.lifespanHours = lifespanHours;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn() {
        setOn(true);
    }

    public void turnOff() {
        setOn(false);
    }

    public void showStatus() {
        if (isOn()) {
            System.out.println("The light bulb is turned on.");
        } else {
            System.out.println("The light bulb is turned off.");
        }
    }

    public void changeStatus() {
        if (isOn()) {
            turnOff();
        } else {
            turnOn();
        }
    }
}
