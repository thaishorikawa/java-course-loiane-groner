package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter M - Morning, A - Afternoon or E - Evening");
        String greeting = scan.next();

        if (greeting.equalsIgnoreCase("m"))
            System.out.println("Good morning!");
        else if (greeting.equalsIgnoreCase("a"))
            System.out.println("Good afternoon!");
        else if (greeting.equalsIgnoreCase("e"))
            System.out.println("Good evening!");
        else
            System.out.println("Invalid letter.");
    }
}
