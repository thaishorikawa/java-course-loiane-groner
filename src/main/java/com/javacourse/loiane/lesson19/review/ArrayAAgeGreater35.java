package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAAgeGreater35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the age of the person " + (i + 1));
            arrayA[i] = scan.nextInt();
        }

        int qt = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > 35) {
                qt++;
            }
        }
        System.out.println();

        System.out.println("Number of people age > 35: " + qt);

    }
}
