package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first grade: ");
        double grade1 = scan.nextDouble();

        System.out.println("Enter the second grade: ");
        double grade2 = scan.nextDouble();

        double media = (grade1 + grade2) / 2;

        if (media == 10)
            System.out.println("Approved with distinction!");
        else if (media >= 7)
            System.out.println("Approved!");
        else
            System.out.println("Failed!");
    }
}
