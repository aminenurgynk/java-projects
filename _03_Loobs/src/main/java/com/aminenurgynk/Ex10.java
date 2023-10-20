package com.aminenurgynk;

/*
The ratio of the sum of even numbers from 1 to 100 to the sum of odd numbers.
 */
public class Ex10 {
    public static void main(String[] args) {

        double sunOdd = 0;
        double sunEven = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sunEven += i;
            } else {
                sunOdd += i;
            }
        }

        System.out.println("Summary of even number: " + sunEven);
        System.out.println("Summary o odd number: " + sunOdd);
        System.out.println("ratio: " + (sunEven / sunOdd));
    }
}
