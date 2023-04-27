package com.javacourse.loiane.lesson20.review;

import java.util.Random;

public class LargestAndSmallestNumberMatrix {

    public static void main(String[] args) {

        int[][] randomNumbers = new int[10][10];

        Random randomNumber = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[i].length; j++) {
                randomNumbers[i][j] = randomNumber.nextInt(100);
            }
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[i].length; j++) {
                System.out.print(randomNumbers[i][j] + " ");
            }
            System.out.println();
        }

        int largestR5 = 0;
        int smallestR5 = 101;
        int row5 = 5;

        for (int i = 0; i < randomNumbers[row5].length; i++) {
            if (randomNumbers[row5][i] > largestR5) {
                largestR5 = randomNumbers[row5][i];
            }
            if (randomNumbers[row5][i] < smallestR5) {
                smallestR5 = randomNumbers[row5][i];
            }
        }

        System.out.println("The largest number of row 5 is: " + largestR5);
        System.out.println("Tha smallest number of row 5 is: " + smallestR5);

        int largestC7 = 0;
        int smallestC7 = 101;
        int col7 = 7;

        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i][col7] > largestC7) {
                largestC7 = randomNumbers[i][col7];
            }
            if (randomNumbers[i][col7] < smallestC7) {
                smallestC7 = randomNumbers[i][col7];
            }
        }

        System.out.println("The largest number of column 7 is: " + largestC7);
        System.out.println("Tha smallest number of column 7 is: " + smallestC7);
    }
}
