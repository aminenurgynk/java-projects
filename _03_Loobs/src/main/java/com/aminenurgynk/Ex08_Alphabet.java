package com.aminenurgynk;

/*
Let's print the alphabet from a to z using a loop.
 */
public class Ex08_Alphabet {

    public static void main(String[] args) {

        // 1st way
        System.out.println("1st way");
        char c;
        for (c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }


        // 2nd way (ASCII Table)
        System.out.println("2nd way (ASCII Table)");
        char char0 = 97;

        while (char0 >= 97 && char0 <= 122) {
            System.out.print(char0 + " ");
            char0++;
        }

        // 3th way (ASCII Table)
        System.out.println("3th way");
        for (char i = 97; i <= 122; i++) {

            System.out.print(i + " ");
        }
    }
}
