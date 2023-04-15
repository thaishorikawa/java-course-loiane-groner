package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (num % 2 == 0)
            System.out.println("It's an even number!");
        else
            System.out.println("It's an odd number!");

    }
}
