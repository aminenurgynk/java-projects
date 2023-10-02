package com.aminenurgynk;

/*
Let's print `Hello` to the screen 5 times.
 */
public class Ex02 {

    public static void main(String[] args) {

// 1st way
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

// 2nd way
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }

}