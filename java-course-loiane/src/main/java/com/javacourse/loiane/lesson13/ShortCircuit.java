package com.javacourse.loiane.lesson13;

public class ShortCircuit {

    public static void main(String[] args) {

        boolean testTrue = true;
        boolean testFalse = false;

        boolean result1 = testFalse & testTrue;
        boolean result2 = testFalse && testTrue;

        System.out.println(result1);
        System.out.println(result2);

    }

}
