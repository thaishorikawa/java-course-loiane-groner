package com.javacourse.loiane.lesson13.review;

import java.util.Scanner;

public class AreaCircleCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double userRadius = scan.nextDouble();

        double userArea = Math.PI * Math.pow(userRadius, 2);

        System.out.println("The area of the circle is: " + userArea);

    }
}
