package com.javacourse.loiane.lesson14;

import java.util.Scanner;

public class IfElseProduct {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price of the product: ");
        double price = scan.nextDouble();

        if (price <= 10) {
            System.out.println("You can buy it.");
        } else if (price > 10 && price < 15) {
            System.out.println("Ask for discount.");
        } else if (price >= 15 && price < 17) {
            System.out.println("It's expensive.");
        } else {
            System.out.println("It's too expensive! Do not buy it.");
        }
    }
}
