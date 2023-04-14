package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class TheGreatestNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        if (num1 > num2)
            System.out.println("Number 1: " + num1 + " is greater than number 2: " + num2);
        else
            System.out.println("Number 2: " + num2 + " is greater than number 1: " +num1);
    }
}
