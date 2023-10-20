package com.aminenurgynk;

import java.util.Scanner;

/*
 * We will continue reading numbers until 0 is entered from the keyboard.
 * When 0 is entered, we will print the sum and the average of the numbers to the screen.
 */
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int counter = 0;

        while (true) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            if (num == 0)
                break;
            sum += num;
            counter++;
            average = (double) sum / counter;
        }

        System.out.println("sum: " + sum);
        System.out.println("average: " + average);

        // 2nd way (without if)

        sum = 0;
        average = 0;
        counter = 1;
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        while (num != 0) {
            sum += num;
            average = sum / (double) counter;
            counter++;
            System.out.println("Enter a number");
            num = scanner.nextInt();
        }

        System.out.println("sum: " + sum);
        System.out.println("average: " + average);
    }
}
