package com.javacourse.loiane.lesson34.review;

public class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static void increase() {
        count++;
    }

    public static void reset() {
        count = 0;
    }
    public static int getValue() {
        return count;
    }
}
