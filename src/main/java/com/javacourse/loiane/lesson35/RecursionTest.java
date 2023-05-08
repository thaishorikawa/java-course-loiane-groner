package com.javacourse.loiane.lesson35;

public class RecursionTest {

    public static void main(String[] args) {

        int factorialWR = Recursion.factorialWithoutRecursion(5);
        System.out.println(factorialWR);

        int factorialR = Recursion.factorial(5);
        System.out.println(factorialR);

    }
}
