package com.aminenurgynk;

import java.util.Scanner;

/*
Let's find out whether a given input number is prime number or not:

If it is prime, print "It is prime."
If it is not prime, print "It is not prime."
 */
public class Ex11_PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int i;
        for (i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                break;
            }
        }

        if (i > num / 2) {
            System.out.println("It is prime");
        } else {
            System.out.println("It is not prime");
        }


        // 2nd way
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        boolean isPrime = true;

        if (num1 < 2) {
            isPrime = false;
        } else {

            for (int i1 = 2; i1 < num1 / 2; i1++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }

            }

        }

        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " isn't prime");
        }

    }
}
