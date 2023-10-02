package com.aminenurgynk;
/*
Let's print the multiplication table of a number entered by the user up to 10.

For example:

int number = 1;

1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
...
 */

import java.util.Scanner;

public class Ex03_MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Multiplication Table");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "= " + (number * i));
        }

    }

}