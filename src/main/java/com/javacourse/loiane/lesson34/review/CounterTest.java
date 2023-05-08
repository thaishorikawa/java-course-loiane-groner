package com.javacourse.loiane.lesson34.review;

public class CounterTest {

    static void displayValue() {
        System.out.println(Counter.getValue());
    }

    public static void main(String[] args) {

        displayValue();

        Counter.increase();

        displayValue();

        Counter.reset();

        displayValue();

        Counter.increase();
        Counter.increase();
        Counter.increase();

        displayValue();

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        displayValue();
    }
}
