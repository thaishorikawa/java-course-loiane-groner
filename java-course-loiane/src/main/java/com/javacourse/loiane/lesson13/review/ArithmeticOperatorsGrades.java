package com.javacourse.loiane.lesson13.review;

import java.util.Scanner;

public class ArithmeticOperatorsGrades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 4 grades of the student: ");

        float grade1 = scan.nextFloat();
        float grade2 = scan.nextFloat();
        float grade3 = scan.nextFloat();
        float grade4 = scan.nextFloat();

        float media = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("The final grade of this student is: " + media);

    }
}
