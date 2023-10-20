package com.aminenurgynk;

import java.util.Scanner;

/*
We will take the base value and the exponent value from outside
(like 2 to the power of 5) and find the result of this operation using a loop.
 */
public class Ex07 {
    public static void main(String[] args) {
        int base;
        int power;
        long result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base number");
        base = input.nextInt();
        System.out.println("Enter a power number");
        power = input.nextInt();

        int i = 1;

        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.println(base + "^" + power + "= " + result);


    }
}
