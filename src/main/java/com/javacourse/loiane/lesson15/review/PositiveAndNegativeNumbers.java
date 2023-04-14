package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (num >= 0)
            System.out.println("It's a positive number!");
        else
            System.out.println("It's a negative number!");
    }
}
