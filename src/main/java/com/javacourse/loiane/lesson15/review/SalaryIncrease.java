package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class SalaryIncrease {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        int percentage = 0;
        if (salary <= 280)
            percentage = 20;
        else if (salary > 280 && salary < 700)
            percentage = 15;
        else if (salary >= 700 && salary < 1500)
            percentage = 10;
        else
            percentage = 5;

        double salaryIncrement = (salary / 100) * percentage;
        double salaryAdjustment = salary + salaryIncrement;

        System.out.println("Your salary is: " + salary);
        System.out.println("The percentage is: " + percentage);
        System.out.println("The increment is: " + salaryIncrement);
        System.out.println("Your adjusted salary is: " + salaryAdjustment);
    }
}
