package com.javacourse.loiane.lesson34.review;

public class CalculatorTest {

    public static void main(String[] args) {

        displayInfo(Calculator.addition(1, 2));
        displayInfo(Calculator.subtraction(2, 1));
        displayInfo(Calculator.multiplication(2, 2));
        displayInfo(Calculator.division(4, 2));
        displayInfo(Calculator.power(2, 3));

    }

    static void displayInfo(int num) {
        System.out.println(num);
    }
}
