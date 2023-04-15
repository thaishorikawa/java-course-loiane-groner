package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter the mathematical operation (+ - / *): ");
        String mathOperation = scan.next();

        double result = 0;
        boolean valid = true;

        switch (mathOperation)
        {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num1 / num2; break;
            default:
                System.out.println("Invalid operation");
                valid = false;
        }

        if (valid)
        {
            System.out.println("Result: " + result);

            if (result >= 0)
                System.out.println("The result is positive!");
            else
                System.out.println("The result is negative!");

            if (result % 2 == 0)
                System.out.println("It's an even result.");
            else
                System.out.println("It's an odd result.");
        }


    }
}
