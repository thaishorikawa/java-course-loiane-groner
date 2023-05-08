package com.javacourse.loiane.lesson35;

public class Recursion {

    public static int factorialWithoutRecursion(int num) {

        if (num == 0) {
            return 1;
        }

        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }

        return total;
    }

    public static int factorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
