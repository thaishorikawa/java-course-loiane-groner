package com.javacourse.loiane.lesson17.review;

public class Population {

    public static void main(String[] args) {

        int popA = 80000;
        int popB = 200000;
        int i = 0;

        while (popA < popB) {
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            i++;
        }

        System.out.println("Population A: " + popA);
        System.out.println("Population B: " + popB);
        System.out.println("Years: " + i);
    }
}
