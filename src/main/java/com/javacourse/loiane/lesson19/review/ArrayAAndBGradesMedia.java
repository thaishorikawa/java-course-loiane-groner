package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAAndBGradesMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] grades1 = new double[4];
        double[] grades2 = new double[grades1.length];
        double[] results = new double[grades1.length];

        for (int i = 0; i < grades1.length; i++) {

            System.out.println("Enter the grade 1 of student " + (i + 1));
            grades1[i] = scan.nextDouble();

            System.out.println("Enter the grade 2 of student " + (i + 1));
            grades2[i] = scan.nextDouble();

            results[i] = (grades1[i] + grades2[i]) / 2;
        }

        System.out.print("Grades 1 = ");
        for (int i = 0; i < grades1.length; i++) {
            System.out.print(grades1[i] + " ");
        }
        System.out.println();

        System.out.print("Grades 2 = ");
        for (int i = 0; i < grades2.length; i++) {
            System.out.print(grades2[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Results: ");
        for (int i = 0; i < results.length; i++) {

            if (results[i] >= 7) {
                System.out.println("Student " + (i + 1) + ": " + results[i] + " - Approved");
            } else {
                System.out.println("Student " + (i + 1) + ": " + results[i] + " - Failed");
            }
        }

    }
}
