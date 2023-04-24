package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayA15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the value of the position: " + i);
            arrayA[i] = scan.nextInt();
        }

        int sumSmaller15 = 0;
        int sumLarger15 = 0;
        int qtLarger15 = 0;
        int equal15 = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == 15) {
                equal15++;
            } else if (arrayA[i] < 15) {
                sumSmaller15 += arrayA[i];
            } else {
                qtLarger15++;
                sumLarger15 += arrayA[i];
            }
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.println("Numbers == 15: " + equal15);
        System.out.println("Sum of numbers < 15: " + sumSmaller15);
        System.out.println("Media of numbers > 15: " + (sumLarger15/qtLarger15));
    }
}
