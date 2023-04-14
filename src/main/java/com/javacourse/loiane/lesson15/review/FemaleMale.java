package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class FemaleMale {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter (F or M): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("f"))
            System.out.println("F - Female");
        else if (input.equalsIgnoreCase("M"))
            System.out.println("M - Male");
        else
            System.out.println("Invalid letter");
    }
}
