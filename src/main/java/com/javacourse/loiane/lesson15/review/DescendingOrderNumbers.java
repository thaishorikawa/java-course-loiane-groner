package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class DescendingOrderNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first, second and third number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3)
            System.out.println(num3 + " - " + num2 + " - " + num1);
        else if (num1 <= num2 && num1 <= num3 && num3 <= num2)
            System.out.println(num2 + " - " + num3 + " - " + num1);
        else if (num2 <= num1 && num2 <= num3 && num1 <= num3)
            System.out.println(num3 + " - " + num1 + " - " + num2);
        else if (num2 <= num1 && num2 <= num3 && num3 <= num1)
            System.out.println(num1 + " - " + num3 + " - " + num2);
        else if (num3 <= num1 && num3 <= num2 && num1 <= num2)
            System.out.println(num2 + " - " + num1 + " - " + num3);
        else
            System.out.println(num1 + " - " + num2 + " - " + num3);
    }
}
