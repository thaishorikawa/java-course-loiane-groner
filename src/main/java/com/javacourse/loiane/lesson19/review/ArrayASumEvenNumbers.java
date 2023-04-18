package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayASumEvenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the value of position " + i);
            arrayA[i] = scan.nextInt();
        }

        int qtEvenNums = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                qtEvenNums++;
            }
        }

        System.out.println();
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.println("Number of even numbers: " + qtEvenNums);
    }
}
