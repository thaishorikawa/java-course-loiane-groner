package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class TheGreatestNumber3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first, second and third number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3)
            System.out.println("Number 1 is the greatest number: " + num1);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println("Number 2 is the greatest number: " + num2);
        else
            System.out.println("Number 3 is the greatest number: " + num3);
    }
}
