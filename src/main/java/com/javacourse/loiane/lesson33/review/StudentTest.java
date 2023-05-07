package com.javacourse.loiane.lesson33.review;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter the name of the student: ");
        student.setName(scan.next());

        System.out.println("Enter the name of the course: ");
        student.setCourseName(scan.next());

        System.out.println("Enter the ID number: ");
        student.setIdNumber(scan.next());

        for (int i = 0; i < student.getSubjectNames().length; i++) {
            System.out.println("Enter the name of the subject " + (i + 1));
            student.setSubjectNamePos(i, scan.next());
        }

        for (int i = 0; i < student.getGrades().length; i++) {
            System.out.println("Grades of " + student.getSubjectNames()[i]);
            for (int j = 0; j < student.getGrades()[i].length; j++) {
                System.out.println("Enter the grade " + (j + 1));
                student.setGradesPosIJ(i, j, scan.nextDouble());
            }
        }

        student.displayInfo();
        System.out.println();

        for (int i = 0; i < student.getSubjectNames().length; i++) {
            if (student.checkApproved(i)) {
                System.out.println(student.getSubjectNames()[i] + " subject - Approved!");
            } else {
                System.out.println(student.getSubjectNames()[i] + " subject - Failed!");
            }
        }
    }
}
