package com.javacourse.loiane.lesson34.review;

public class Calculator {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int power(int num1, int num2) {
        int total = 1;
        for (int i = 1; i <= num2; i++) {
            total *= num1;
        }

        return total;
    }
}
