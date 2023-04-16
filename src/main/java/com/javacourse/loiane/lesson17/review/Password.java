package com.javacourse.loiane.lesson17.review;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean validInfo = false;
        String userName;
        String userPassword;

        do {
            System.out.println("Enter your user name: ");
            userName = scan.next();

            System.out.println("Enter your password: ");
            userPassword = scan.next();

            if (userName.equalsIgnoreCase(userPassword)) {
                System.out.println("Your password and your user name are the same. Please, enter again.");
            } else {
                validInfo = true;
                System.out.println("User and password are ok!");
            }
        } while (!validInfo);
    }

}
