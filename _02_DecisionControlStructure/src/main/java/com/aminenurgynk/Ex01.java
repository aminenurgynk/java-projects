package com.aminenurgynk;

import java.util.Scanner;

/*
Let's take 2 numbers from scanner,
add them
control --> if it is even return true,
it is not return false
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int number1 = scanner.nextInt();
        System.out.println("Enter 2nd number ");
        int number2 = scanner.nextInt();

        int result = number1 + number2;

        // 1st way
        boolean control1 = result % 2 == 0;

        // 2nd way
        System.out.println(result % 2 == 0 ? "Even" : "Odd");
        // or
        System.out.println(control1 ? "Even" : "Odd");


    }
}