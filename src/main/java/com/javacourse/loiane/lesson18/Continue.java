package com.javacourse.loiane.lesson18;

import java.util.Scanner;

public class Continue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("Enter a maximum number: ");
        int maxNum = scan.nextInt();

        for (int i = num; i <= maxNum; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("I = " + i);
        }

    }
}
