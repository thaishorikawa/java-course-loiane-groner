package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAMultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[5];

        for (int i = 0; i < arrayA.length; i++) {

            System.out.println("Enter the value of position A - " + i);
            arrayA[i] = scan.nextInt();
        }

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Table of " + arrayA[i]);
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + arrayA[i] + " = " + (arrayA[i] * j));
            }
            System.out.println();
        }
        
    }
}
