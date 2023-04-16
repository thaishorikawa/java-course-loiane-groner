package com.javacourse.loiane.lesson19;

public class Arrays {

    public static void main(String[] args) {

        double[] temperatures = new double[365];
        temperatures[0] = 31.3;
        temperatures[1] = 32;
        temperatures[2] = 33.7;
        temperatures[3] = 34;
        temperatures[4] = 33.1;
        temperatures[5] = 32.5;

        System.out.println("The temperature of day 1 is: " + temperatures[0]);

        System.out.println("The length of the array is: " + temperatures.length);

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("The temperature of the day " + (i + 1) + " is: " + temperatures[i]);
        }

        for (double temp : temperatures) {
            System.out.println(temp);
        }
    }
}
