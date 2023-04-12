package com.javacourse.loiane.lesson13.review;

import java.util.Scanner;

public class AreaSquareCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the side of a square: ");
        double userSide = scan.nextDouble();

        double userArea = Math.pow(userSide, 2);

        System.out.println("The area of the square is: " + userArea);

    }
}
