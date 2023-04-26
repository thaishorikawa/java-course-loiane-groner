package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAAndB30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the value of position A - " + i);
            arrayA[i] = scan.nextInt();
        }

        int posB = 0;
        int posC = 0;

        for (int i = 0; i < arrayA.length; i++) {

            if (arrayA[i] % 2 == 0) {
                arrayB[posB] = arrayA[i];
                posB++;
            } else {
                arrayC[posC] = arrayA[i];
                posC++;
            }
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.print("Array B = ");
        for (int i = 0; i < posB; i++) {
            System.out.print(arrayB[i] + " ");
        }
        System.out.println();

        System.out.print("Array C = ");
        for (int i = 0; i < posC; i++) {
            System.out.print(arrayC[i] + " ");
        }

    }
}
