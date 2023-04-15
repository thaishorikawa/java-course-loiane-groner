package com.javacourse.loiane.lesson16;

public class DoWhile {

    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("Counting to " + max);

        while (i <= max) {
            System.out.println("I = " + i);
            i++;
        }

        do {
            i++;
            System.out.println("I: " + i);
        } while (i < 13);

        System.out.println(i);
    }
}
