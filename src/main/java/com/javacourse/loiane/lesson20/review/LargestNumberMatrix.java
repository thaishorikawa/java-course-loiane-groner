package com.javacourse.loiane.lesson20.review;

import java.util.Random;

public class LargestNumberMatrix {

    public static void main(String[] args) {

        int[][] randomNumbers = new int[4][4];

        Random randomNumber = new Random();

        //filling out the matrix
        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[i].length; j++) {
                randomNumbers[i][j] = randomNumber.nextInt(100);
            }
        }

        int largestNumber = 0;
        int row = 0;
        int column = 0;

        //finding out the largest number
        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[i].length; j++) {
                if (randomNumbers[i][j] > largestNumber) {
                    largestNumber = randomNumbers[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        //printing the matrix
        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[i].length; j++) {
                System.out.print(randomNumbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The largest number is: " + largestNumber);
        System.out.println("Row: " + row);
        System.out.println("Column: " + column);

    }
}
