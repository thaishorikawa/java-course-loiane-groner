package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArraysAAndB6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the value of ArrayA of position: " + i);
            arrayA[i] = scan.nextInt();
        }

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Enter the value of ArrayB of position: " + i);
            arrayB[i] = scan.nextInt();
        }

        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        System.out.println();

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
        System.out.println();
    }
}
