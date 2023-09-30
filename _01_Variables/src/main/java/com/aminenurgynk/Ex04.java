package com.aminenurgynk;

import java.util.Scanner;

/*
Scanner

Let's take the radius information from the user.

Area =  π * r * r
Perimeter = 2 * π * r"
 */
public class Ex04 {
    public static void main(String[] args) {
        double pi = 3.14, radius, perimeter, area;


        Scanner input = new Scanner(System.in);


        System.out.println("Enter the radius info. ");
        radius = input.nextDouble();

        perimeter = pi * radius * 2;
        area = pi * radius * radius;

        System.out.println("Area of circle : " + area + "\nPerimeter of circle : " + perimeter);
    }
}
