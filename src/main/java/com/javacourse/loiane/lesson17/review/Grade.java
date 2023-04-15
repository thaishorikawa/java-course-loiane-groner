package com.javacourse.loiane.lesson17.review;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean validGrade = false;

        do {
            System.out.println("Enter a grade: ");

            double grade = scan.nextDouble();

            if (grade >= 0 && grade <= 10) {
                validGrade = true;
                System.out.println("You've entered: " + grade);
            } else {
                System.out.println("Invalid grade, try again.");
            }
        } while (!validGrade);

    }
}
