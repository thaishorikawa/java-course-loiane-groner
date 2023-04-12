package com.javacourse.loiane.lesson13.review;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        double userHourlyRate = scan.nextDouble();

        System.out.println("Enter your total hours worked per month: ");
        double userHours = scan.nextDouble();

        double salary = userHourlyRate * userHours;

        System.out.println("Your salary is: " + salary);

    }
}
