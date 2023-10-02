package com.aminenurgynk;
/*
Let's calculate the factorial of a number entered by the user.
 */

import java.util.Scanner;

public class Ex04_Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int factorial = 1;
        int number = scanner.nextInt();
        int i = 1;
        while (number >= i) {

            factorial *= number;
            number--;
        }
        System.out.println("factorial= " + factorial);

        System.out.println("Enter a number");
        number = scanner.nextInt();
        factorial = 1;

        // 1st way

        for (int j = 1; j <= number; j++) {

            factorial *= j;
        }

        System.out.println("factorial= " + factorial);

        factorial = 1;

        // 2nd way
        for (int j = number; j >= 1; j--) {

            factorial *= j;
        }

        System.out.println("factorial= " + factorial);

    }

}
