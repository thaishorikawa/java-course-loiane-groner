package com.javacourse.loiane.lesson15.review;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side 1: ");
        int side1 = scan.nextInt();

        System.out.println("Enter the side 2: ");
        int side2 = scan.nextInt();

        System.out.println("Enter the side 3: ");
        int side3 = scan.nextInt();

        if (((side1 + side2) > side3) || ((side1 + side3) > side2) || ((side2 + side3) > side1))
        {
            if (side1 == side2 && side1 == side3 && side2 == side3)
                System.out.println("Equilateral triangle!");
            else if (side1 != side2 && side1 != side3 && side3 != side2)
                System.out.println("Scalene triangle!");
            else if (side1 == side2 || side1 == side3 || side2 == side3)
                System.out.println("Isosceles triangle!");
        } else {
            System.out.println("It's not a triangle!");
        }
    }
}
