package com.javacourse.loiane.lesson20.review;

import java.util.Scanner;

public class OddAndEvenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] numbers = new int[3][3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                System.out.println("Enter the value of the position [" + i + "," + j + "]");
                numbers[i][j] = scan.nextInt();
            }
        }

        int numEven = 0;
        int numOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    numEven++;
                } else {
                    numOdd++;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Even numbers: " + numEven);
        System.out.println("Odd numbers: " + numOdd);
    }
}
