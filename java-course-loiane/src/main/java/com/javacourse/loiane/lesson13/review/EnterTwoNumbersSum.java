package com.javacourse.loiane.lesson13.review;

import java.util.Scanner;

public class EnterTwoNumbersSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scan.nextInt();

        int result = number1 + number2;
        System.out.println("The sum of two numbers is: " + result);

    }
}
