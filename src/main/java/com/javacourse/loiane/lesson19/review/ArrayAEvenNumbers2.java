package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAEvenNumbers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[6];

        for (int i = 0; i < arrayA.length; i++) {

            System.out.println("Enter the value of position A - " + i);
            arrayA[i] = scan.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++) {

            System.out.println("Number " + arrayA[i]);

            for (int j = 2; j < arrayA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " is an odd number");
                }
            }

            System.out.println();
        }

    }
}
