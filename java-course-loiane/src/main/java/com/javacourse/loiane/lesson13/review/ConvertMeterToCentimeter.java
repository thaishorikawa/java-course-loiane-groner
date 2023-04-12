package com.javacourse.loiane.lesson13.review;

import java.util.Scanner;

public class ConvertMeterToCentimeter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Value in meter is: ");
        double userMeter = scan.nextDouble();

        double userCentimeter = userMeter * 100;

        System.out.println(userMeter + " m is equal to " + userCentimeter + " cm");


    }
}
