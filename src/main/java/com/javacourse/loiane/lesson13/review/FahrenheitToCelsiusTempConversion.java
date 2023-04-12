package com.javacourse.loiane.lesson13.review;

import java.util.Scanner;

public class FahrenheitToCelsiusTempConversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temperature in Farenheit: ");
        double userF = scan.nextDouble();

        double userC = (5 * (userF-32) / 9);

        System.out.println("The temperature " + userF + " F is equal to " + userC + " C");

    }
}
