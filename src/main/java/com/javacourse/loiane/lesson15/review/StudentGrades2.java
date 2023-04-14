package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class StudentGrades2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first grade: ");
        double grade1 = scan.nextDouble();

        System.out.println("Enter the second grade: ");
        double grade2 = scan.nextDouble();

        double media = (grade1 + grade2) / 2;

        String performance = "";
        if (media >= 9 && media <= 10)
            performance = "A";
        else if (media >= 7.5 && media < 9)
            performance = "B";
        else if (media >= 6 && media < 7.5)
            performance = "C";
        else if (media >= 4 && media < 6)
            performance = "D";
        else if (media >= 0 && media < 4)
            performance = "E";

        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Media: " + media);
        System.out.println("Performance: " + performance);

        switch (performance)
        {
            case "A":
            case "B":
            case "C": System.out.println("APPROVED!"); break;
            case "D":
            case "E": System.out.println("FAILED!"); break;
        }

    }
}
