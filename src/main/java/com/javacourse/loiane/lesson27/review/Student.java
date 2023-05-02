package com.javacourse.loiane.lesson27.review;

public class Student {

    String name;
    String idNumber;
    String courseName;
    String[] subjectNames;
    double[][] grades;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID number: " + idNumber);
        System.out.println("Name of the course: " + courseName);

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grades of " + subjectNames[i]);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean checkApproved(int index) {
        double sum = 0;

        for (int i = 0; i < grades[index].length; i++) {
            sum += grades[index][i];
        }

        double media = sum / 4;

        if (media >= 7) {
            return true;
        }
        return false;
    }

}
