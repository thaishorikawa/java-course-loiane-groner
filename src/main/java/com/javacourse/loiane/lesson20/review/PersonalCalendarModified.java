package com.javacourse.loiane.lesson20.review;

import java.util.Scanner;

public class PersonalCalendarModified {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] appointments = new String[12][31][24];

        boolean exit = false;
        byte option;
        while (!exit) {

            System.out.println("Enter 1 to add an appointment.");
            System.out.println("Enter 2 to verify an appointment.");
            System.out.println("Enter 0 to exit.");

            option = scan.nextByte();

            if (option == 1) {

                boolean validMonth = false;
                int month = 0;
                while (!validMonth) {
                    System.out.println("Enter the month: ");
                    month = scan.nextInt();
                    if (month > 0 && month <= 12) {
                        validMonth = true;
                    } else {
                        System.out.println("Invalid month, try again.");
                    }
                }

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
                    if (time >= 0 && time <= 8) {
                        validTime = true;
                    } else {
                        System.out.println("Invalid time, try again.");
                    }
                }

                System.out.println("Enter the appointment: ");
                appointments[--month][--day][time] = scan.next();


            } else if (option == 2) {

                boolean validMonth = false;
                int month = 0;
                while (!validMonth) {
                    System.out.println("Enter the month: ");
                    month = scan.nextInt();
                    if (month > 0 && month <= 12) {
                        validMonth = true;
                    } else {
                        System.out.println("Invalid month, try again.");
                    }
                }

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
                System.out.println(appointments[--month][--day][time]);

            } else if (option == 0) {
                exit = true;
            } else {
                System.out.println("Invalid option, try again.");
            }
        }

    }
}
