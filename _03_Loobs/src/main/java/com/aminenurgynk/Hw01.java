package com.aminenurgynk;

import java.util.Scanner;

public class Hw01 {

    public static void main(String[] args) {

        System.out.println("------------------------Q1------------------------");

        /*
         * Q1 - We will take the base value and the exponent value from the outside
         * (like 2 to the power of 5) and find the result of this operation using a loop.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a base value");
        int base = scanner.nextInt();
        System.out.println("Enter a number for power");
        int power = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {

            result = result * base;

        }

        System.out.println(base + " power " + power + " : " + result);

        System.out.println("------------------------Q2---------------------");
        /*
        Question 2 - Let's print the alphabet from 'a' to 'z' using a loop.


char i = 'A';
for (i = 'A'; i <= 'Z'; i++) {
System.out.print(i + " ");
}
System.out.print();

****************
*char char1 = 97;//97*122
*while (char1 >=97 && char1<=122)
*{SYso (char1 + " ")}
         */

        System.out.println("------------------------Q3------------------------");

        /*
Question 3 - We will continue to read numbers from the keyboard until 0 is entered.
When 0 is entered, let's print the total and the average of the numbers on the screen.
 */

        double average = 0;
        int counter = 0;
        int sum = 0;


        while (true) {

            System.out.println("Enter a number");
            int number = scanner.nextInt();
            if (number == 0) break;
            sum += number;
            counter++;
            average = (double) sum / counter;

        }
        System.out.println("sum : " + sum + "\naverage : " + average);

        System.out.println("------------------------Q4------------------------");

        /*
         * Q4 - The ratio of the sum of even numbers from 1 to 100 to the sum of odd numbers.
         */

        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                evenNumber += i;

            } else {

                oddNumber += i;
            }

        }

        double proportion = evenNumber / oddNumber;
        System.out.println("Proportion : " + proportion);

    }


}





