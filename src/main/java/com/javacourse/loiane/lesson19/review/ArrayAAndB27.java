package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAAndB27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];
        char[] arrayB = new char[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {

            System.out.println("Enter the number of position = " + i);
            arrayA[i] = scan.nextInt();

            if (arrayA[i] < 7) {
                arrayB[i] = 'a';
            } else if (arrayA[i] == 7) {
                arrayB[i] = 'b';
            } else if (arrayA[i] > 7 && arrayA[i] < 10){
                arrayB[i] = 'c';
            } else if (arrayA[i] == 10) {
                arrayB[i] = 'd';
            } else if (arrayA[i] > 10) {
                arrayB[i] = 'e';
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
    }
}
