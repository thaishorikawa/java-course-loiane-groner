package com.javacourse.loiane.lesson20;

public class Matrix3D {

    public static void main(String[] args) {

        int[][][] matrix3D = new int[3][3][3];

        for (int i = 0; i < matrix3D.length; i++) {
            for (int j = 0; j < matrix3D[i].length; j++) {
                for (int k = 0; k < matrix3D[i][j].length; k++) {
                    matrix3D[i][j][k] = i + j + k;
                }
            }
        }

        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < matrix3D.length; i++) {
            for (int j = 0; j < matrix3D[i].length; j++) {
                for (int k = 0; k < matrix3D[i][j].length; k++) {

                    sum += matrix3D[i][j][k];

                    if (matrix3D[i][j][k] % 2 == 0) {
                        sumEven += matrix3D[i][j][k];
                    } else {
                        sumOdd += matrix3D[i][j][k];
                    }
                }
            }
        }

        System.out.println("Total = " + sum);
        System.out.println("Sum of even numbers = " + sumEven);
        System.out.println("Sum of odd numbers = " + sumOdd);


    }
}
