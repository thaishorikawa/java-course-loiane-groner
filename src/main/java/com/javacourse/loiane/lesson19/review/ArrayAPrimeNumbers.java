package com.javacourse.loiane.lesson19.review;

import java.util.Scanner;

public class ArrayAPrimeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayA = new int[5];

        for (int i = 0; i < arrayA.length; i++) {

            System.out.println("Enter the value of position A - " + i);
            arrayA[i] = scan.nextInt();

        }

        boolean prime;
        String msg;

        for (int i = 0; i < arrayA.length; i++) {

            prime = true;
            for (int j = 2; j < arrayA[i]; j++) {
                if (arrayA[i] % j == 0) {
                    prime = false;
                    break;
                }
            }

            msg = "";
            if (prime) {
                msg = " Prime number";
            } else {
                msg = " It's not a prime number";
            }

            System.out.println(arrayA[i] + msg);
        }

    }
}
