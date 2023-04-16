package com.javacourse.loiane.lesson17.review;

import java.util.Scanner;

public class ReadAndValidate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean validInfo = false;
        String name;
        int age;
        double salary;

        do {
            System.out.println("Enter your name: ");
            name = scan.next();

            if (name.length() >= 3) {
                validInfo = true;
            } else {
                System.out.println("Name must have at least 3 characters.");
            }
        } while (!validInfo);


        validInfo = false;
        do {
            System.out.println("Enter your age: ");
            age = scan.nextInt();

            if (age >= 0 && age <= 150) {
                validInfo = true;
            } else {
                System.out.println("Age must be between 0 and 150.");
            }
        } while (!validInfo);

        validInfo = false;
        do {
            System.out.println("Enter your salary: ");
            salary = scan.nextDouble();

            if (salary > 0) {
                validInfo = true;
            } else {
                System.out.println("Salary must be higher than 0.");
            }
        } while (!validInfo);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
