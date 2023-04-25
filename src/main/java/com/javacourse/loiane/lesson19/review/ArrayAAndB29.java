package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAAndB29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length * 2];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the number of position A - " + i);
            arrayA[i] = scan.nextInt();

            arrayC[i] = arrayA[i];
        }

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Enter the number of position B - " + i);
            arrayB[i] = scan.nextInt();

            arrayC[arrayA.length + i] = arrayB[i];
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.print("Array B = ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");
        }
        System.out.println();

        System.out.print("Array C = ");
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + " ");
        }
    }
}
