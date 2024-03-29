package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAPalindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[10];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Enter the number of position " + i);
            arrayA[i] = scan.nextInt();
        }

        boolean palindrome = true;
        for (int i = 0; i < (arrayA.length/2); i++) {
            if (arrayA[i] != arrayA[arrayA.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        if (palindrome) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("It's not palindrome!");
        }

    }
}
