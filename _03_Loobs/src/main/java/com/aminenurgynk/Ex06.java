package com.aminenurgynk;
/*
Let's calculate the sum of the digits of the entered number
and display it on the screen.
We will also determine and display how many digits the number has.
 */

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit;
        int number = scanner.nextInt();
        int counter = 0;
        int sum = 0;

        // 1st way - do while
        do {
            digit = number % 10; // 0-0-1
            sum += digit;// 0-0-1
            number /= 10;// 10-1-0.1=0
            counter++;// 1-2-3

        } while (number != 0); // number>0 or number>=1

        System.out.println("sum " + sum);
        System.out.println("digit " + counter);

        // 2nd way - while
        number = scanner.nextInt();
        counter = 0;
        sum = 0;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
            counter++;
        }

        System.out.println("sum " + sum);
        System.out.println("digit " + counter);

        // 3th way - for
        counter = 0;
        sum = 0;

        for (int number2 = scanner.nextInt(); number2 > 0; number2 /= 10) {
            digit = number2 % 10;
            sum += digit;

            System.out.println(counter);
            counter++;
        }

        // Other way - for
        // 		for (int number2 = scanner.nextInt(); number2 > 0; ) {
        // 			digit = number2 % 10;
        // 			sum += digit;
        //          number2 /= 10
        // 			System.out.println(counter);
        // 			counter++;
        //		}

        System.out.println("sum " + sum);
        System.out.println("digit " + counter);
    }

}
