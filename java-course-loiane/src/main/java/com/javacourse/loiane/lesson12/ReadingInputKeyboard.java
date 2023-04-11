package com.javacourse.loiane.lesson12;

import java.util.Scanner;

public class ReadingInputKeyboard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String userFullName = scan.nextLine();
        System.out.println("Your full name is: " + userFullName);

        System.out.println("Enter your first name: ");
        String userFirstName = scan.next();
        System.out.println("Your first name is: " + userFirstName);

        System.out.println("Enter your age: ");
        int userAge = scan.nextInt();
        System.out.println("Your age is: " + userAge);

        System.out.println("Enter your height: ");
        double userHeight = scan.nextDouble();
        System.out.println("Your height is: " + userHeight);

        System.out.println("Enter your lucky number, last name, weight and if you have a pet");
        int userLuckyNumber = scan.nextInt();
        String userLastName = scan.next();
        float userWeight = scan.nextFloat();
        boolean userPet = scan.nextBoolean();

        System.out.println("You've entered the following values: ");
        System.out.println("Lucky number: " + userLuckyNumber);
        System.out.println("Last name: " + userLastName);
        System.out.println("Weight: " + userWeight);
        System.out.println("Do you have a pet? " + userPet);

    }
}
