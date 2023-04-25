package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAAndB25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the number of position " + i);
            arrayA[i] = scan.nextInt();

            arrayB[i] = (arrayA[i] % 2 == 0) ? 1 : 0;
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
    }
}
