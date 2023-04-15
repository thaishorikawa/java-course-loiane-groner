package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number for a: ");
        int a = scan.nextInt();

        if (a == 0)
            System.out.println("It's not a quadratic equation!");
        else {
            System.out.println("Enter a number for b: ");
            int b = scan.nextInt();

            System.out.println("Enter a number for c: ");
            int c = scan.nextInt();

            double delta = (b * b) - (4 * a * c);
            if (delta < 0)
                System.out.println("Negative delta!");
            else {

                System.out.println("Delta: " + delta);
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

    }
}
