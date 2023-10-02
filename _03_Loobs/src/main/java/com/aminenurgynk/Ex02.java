package com.aminenurgynk;

import java.util.Scanner;

/*
A program that prints the sum of even numbers from 1 to the input number.
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum = 0;

// 1st way
        for (int i = 2; i <= number; i += 2) {
            sum += i;

        }
        System.out.println("sum= " + sum);

        sum = 0;

// 2nd way
        for (int i = 1; i <= number; i++) {

            int a = i % 2 == 0 ? i : 0;
            sum += a;
        }

        System.out.println("sum= " + sum);
    }

}
