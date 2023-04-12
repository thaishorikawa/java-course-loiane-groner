package com.javacourse.loiane.lesson13.review;

import java.util.Scanner;

public class EnterAnIntNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an int number: ");
        int number = scan.nextInt();
        System.out.println("You've entered the number: " + number);

    }

}
