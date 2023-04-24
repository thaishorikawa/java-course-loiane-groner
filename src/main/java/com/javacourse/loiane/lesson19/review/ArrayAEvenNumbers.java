package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAEvenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {

            System.out.println("Enter the number of position " + i);
            arrayA[i] = scan.nextInt();

            if (arrayA[i] % 2 != 0) {
                break;
            }
        }
    }
}
