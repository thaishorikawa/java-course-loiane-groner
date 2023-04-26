package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAAndB31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {

            System.out.println("Enter the value of position A - " + i);
            arrayA[i] = scan.nextInt();
        }

        int posB = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                arrayB[posB] = arrayA[i];
                posB++;
            }
        }

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 != 0) {
                arrayB[posB] = arrayA[i];
                posB++;
            }
        }

        System.out.print("Array A - ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.print("Array B - ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayB[i] + " ");
        }

    }
}
