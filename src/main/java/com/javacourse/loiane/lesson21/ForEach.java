package com.javacourse.loiane.lesson21;

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {

        int[] grades = new int[10];

        Random random = new Random();

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(10);
        }

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            System.out.println(grade);
        }

        System.out.println("Example: For each");

        for (int grade : grades) {
            System.out.println(grade);
        }
    }
}
