package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAAndB26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the number of position A = ");
            arrayA[i] = scan.nextInt();
        }

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Enter the number of position B = ");
            arrayB[i] = scan.nextInt();

            if (arrayA[i] == arrayB[i]) {
                arrayC[i] = 0;
            } else if (arrayA[i] > arrayB[i]) {
                arrayC[i] = 1;
            } else {
                arrayC[i] = -1;
            }
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
