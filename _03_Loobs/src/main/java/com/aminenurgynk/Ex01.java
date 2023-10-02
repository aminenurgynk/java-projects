package com.aminenurgynk;

import java.util.Scanner;

/*
A program that prints the sum of numbers from 1 to the input number.
 */
public class Ex01 {

    public static void main(String[] args) {

        int number;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("for sum= " + sum);

        sum = 0;
        int i = 1;

        while (i <= number) {
            sum += i;
            i++;

        }

        System.out.println("while sum= " + sum);


    }


}
