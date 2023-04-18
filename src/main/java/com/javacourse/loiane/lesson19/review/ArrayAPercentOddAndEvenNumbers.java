package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAPercentOddAndEvenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the value of the position: " + i);
            arrayA[i] = scan.nextInt();
        }

        int oddNum = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 != 0) {
                oddNum++;
            }
        }

        int evenNum = arrayA.length - oddNum;

        double percEven = (evenNum * 100) / arrayA.length;
        double percOdd = 100 - percEven;

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.println("Percentage of even numbers: " + percEven);
        System.out.println("Percentage of odd numbers: " + percOdd);
    }
}
