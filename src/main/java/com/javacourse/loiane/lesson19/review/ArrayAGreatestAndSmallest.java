package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAGreatestAndSmallest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter the age of a person: " + (i + 1));
            ages[i] = scan.nextInt();
        }

        int smallest = ages[0];
        int smallestIndex = 0;
        int greatest = ages[0];
        int greatestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > greatest) {
                greatest = ages[i];
                greatestIndex = i;
            } else if (ages[i] < smallest) {
                smallest = ages[i];
                smallestIndex = i;
            }
        }

        System.out.print("Array of ages = ");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + " ");
        }
        System.out.println();

        System.out.println("The smallest age is: " + smallest);
        System.out.println("Index of the smallest age: " + smallestIndex);
        System.out.println("The greatest age is: " + greatest);
        System.out.println("Index of the greatest age: " + greatestIndex);
    }
}
