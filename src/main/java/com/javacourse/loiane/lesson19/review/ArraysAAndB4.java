package com.javacourse.loiane.lesson19.review;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysAAndB4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[15];
        double[] arrayB = new double[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the value of the position: " + i);
            arrayA[i] = scan.nextInt();

            arrayB[i] = Math.sqrt(arrayA[i]);
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Array B = ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(df.format(arrayB[i]) + " ");
        }
        System.out.println();
    }
}
