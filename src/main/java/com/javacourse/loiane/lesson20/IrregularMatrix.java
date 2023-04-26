package com.javacourse.loiane.lesson20;

import java.util.Scanner;

public class IrregularMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of people are being interviewed: ");

        int numInterviewed = scan.nextInt();

        String[][] childrenNames = new String[numInterviewed][];

        for (int i = 0; i < childrenNames.length; i++) {

            System.out.println("Enter the number of children: ");
            int numChildren = scan.nextInt();

            childrenNames[i] = new String[numChildren];

            for (int j = 0; j < childrenNames[i].length; j++) {
                System.out.println("Enter the child name " + (j + 1));
                childrenNames[i][j] = scan.next();
            }
        }

        for (int i = 0; i < childrenNames.length; i++) {
            System.out.println("Person " + i + " has " + childrenNames[i].length + " children");
            for (int j = 0; j < childrenNames[i].length; j++) {
                System.out.println(childrenNames[i][j]);
            }

        }
    }
}
