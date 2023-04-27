package com.javacourse.loiane.lesson20.review;

import java.util.Scanner;

public class PersonalCalendar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] appointments = new String[31][24];

        boolean exit = false;
        byte option;
        while (!exit) {

            System.out.println("Enter 1 to add an appointment.");
            System.out.println("Enter 2 to verify an appointment.");
            System.out.println("Enter 0 to exit.");

            option = scan.nextByte();

            if (option == 1) {

                boolean validDay = false;
                int day = 0;
                while (!validDay) {
                    System.out.println("Enter the day of the month: ");
                    day = scan.nextInt();
                    if (day > 0 && day <= 31) {
                        validDay = true;
                    } else {
                        System.out.println("Invalid day, try again.");
                    }
                }

                boolean validTime = false;
                int time = 0;
                while (!validTime) {
                    System.out.println("Enter the time of the appointment: ");
                    time = scan.nextInt();
                    if (time >= 0 && time <= 24) {
                        validTime = true;
                    } else {
                        System.out.println("Invalid time, try again.");
                    }
                }

                System.out.println("Enter the appointment: ");
                appointments[--day][time] = scan.next();


            } else if (option == 2) {

                boolean validDay = false;
                int day = 0;
                while (!validDay) {
                    System.out.println("Enter the day of the month: ");
                    day = scan.nextInt();
                    if (day > 0 && day <= 31) {
                        validDay = true;
                    } else {
                        System.out.println("Invalid day, try again.");
                    }
                }

                boolean validTime = false;
                int time = 0;
                while (!validTime) {
                    System.out.println("Enter the time of the appointment: ");
                    time = scan.nextInt();
                    if (time >= 0 && time <= 24) {
                        validTime = true;
                    } else {
                        System.out.println("Invalid time, try again.");
                    }
                }

                System.out.println("The appointment is on: ");
                System.out.println(appointments[--day][time]);

            } else if (option == 0) {
                exit = true;
            } else {
                System.out.println("Invalid option, try again.");
            }
        }

    }
}
