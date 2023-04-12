package com.javacourse.loiane.lesson13;

public class LogicalOperators {

    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 2;

        boolean result1 = (number1 == 1) && (number2 == 2);
        System.out.println("Number 1 is 1 AND number 2 is 2 - result: " + result1);

        boolean result2 = (number1 == 1) || (number2 == 2);
        System.out.println("Number 1 is 1 OR number 2 is 2 - result: " + result2);

        boolean testTrue = true;
        boolean testFalse = false;
        System.out.println(testTrue && testFalse);
        System.out.println(testTrue || testFalse);
        System.out.println(testTrue ^ testFalse);
        System.out.println(!testTrue && testFalse);




    }

}
