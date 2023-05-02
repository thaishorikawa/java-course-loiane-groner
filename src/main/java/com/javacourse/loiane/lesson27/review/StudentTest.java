package com.javacourse.loiane.lesson27.review;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter the name of the student: ");
        student.name = scan.next();

        System.out.println("Enter the name of the course: ");
        student.courseName = scan.next();

        System.out.println("Enter the ID number: ");
        student.idNumber = scan.next();

        student.subjectNames = new String[3];
        for (int i = 0; i < student.subjectNames.length; i++) {
            System.out.println("Enter the name of the subject " + (i + 1));
            student.subjectNames[i] = scan.next();
        }

        student.grades = new double[3][4];
        for (int i = 0; i < student.grades.length; i++) {
            System.out.println("Grades of " + student.subjectNames[i]);
            for (int j = 0; j < student.grades[i].length; j++) {
                System.out.println("Enter the grade " + (j + 1));
                student.grades[i][j] = scan.nextDouble();
            }
        }

        student.displayInfo();
        System.out.println();

        for (int i = 0; i < student.subjectNames.length; i++) {
            if (student.checkApproved(i)) {
                System.out.println(student.subjectNames[i] + " subject - Approved!");
            } else {
                System.out.println(student.subjectNames[i] + " subject - Failed!");
            }
        }
    }
}
