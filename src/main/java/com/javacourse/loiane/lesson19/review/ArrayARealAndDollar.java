package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayARealAndDollar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] arrayA = new double[6];
        double conversionRate;

        System.out.println("Enter the dollar conversion rate: ");
        conversionRate = scan.nextDouble();

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = conversionRate * (i + 1);
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

    }
}
