package com.javacourse.loiane.lesson19.review;

public class ArrayARandom0And1 {

    public static void main(String[] args) {

        int[] arrayA = new int[10];
        int qt0 = 0;
        int qt1 = 0;

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) Math.round(Math.random() * 1);

            if (arrayA[i] == 0) {
                qt0++;
            } else {
                qt1++;
            }
        }

        double perc0 = (qt0 * 100) / arrayA.length;
        double perc1 = (qt1 * 100) / arrayA.length;

        System.out.print("Array A = ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();

        System.out.println("Perc 0 = " + perc0);
        System.out.println("Perc 1 = " + perc1);

    }


}
