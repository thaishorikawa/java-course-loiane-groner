package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAOddMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the value of the position " + i);
            arrayA[i] = scan.nextInt();
        }

        int sum = 0;
        int odd = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 != 0) {
                sum += arrayA[i];
                odd++;
            }
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.println("Sum: " + sum);
        System.out.println("Media: " + (sum/odd));
    }
}
