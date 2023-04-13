package com.javacourse.loiane.lesson14;

import java.util.Scanner;

public class IfElseAge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int userAge = scan.nextInt();

        if (userAge >= 18) {
            System.out.println("You are of age!");
        } else {
            System.out.println("You are a minor!");
        }

    }
}
