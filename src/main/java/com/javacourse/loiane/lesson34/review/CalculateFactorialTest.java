package com.javacourse.loiane.lesson34.review;

import java.util.Scanner;

public class CalculateFactorialTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.println("Enter a positive number: ");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Invalid number. Try again.");
            }
        } while (num < 0);

        System.out.println(CalculateFactorial.factorial(num));
    }
}
