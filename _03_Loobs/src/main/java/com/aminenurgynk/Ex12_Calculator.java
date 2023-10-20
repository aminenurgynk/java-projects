package com.aminenurgynk;

import java.util.Scanner;
/*
Let's have two numeric variables.

We will choose an operation from outside (addition, division, subtraction, multiplication - (+, /, -, *)).

According to the selected operation, it will perform the operation and find the result.

Lastly, we will print the result.
 */
public class Ex12_Calculator {

    public static void main(String[] args) {

        int num1 = 58;
        int num2 = 94;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a operation (addition, division, subtraction, multiplication - (+, /, -, *)");
        String operation = scanner.nextLine();
        double result;
        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "/":
                result = (double) num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            default:
                break;
        }

    }
}
