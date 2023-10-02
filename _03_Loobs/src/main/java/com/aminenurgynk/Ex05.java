package com.aminenurgynk;

/*
Let's start adding numbers from 1,
and
our program will continue until the total is greater than 50.
At the end, we'll display the total and how many times it ran.
 */
public class Ex05 {

    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;
        int number = 0;

        while (sum <= 50) {
            number++;
            sum += number;
            counter++;
            System.out.println("sum : " + sum + " dongu sayısı : " + counter);
        }

        System.out.println("sum  : " + sum);
        System.out.println("counter  : " + counter);
        System.out.println("number  : " + number);
    }

}
