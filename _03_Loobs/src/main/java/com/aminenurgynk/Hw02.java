package com.aminenurgynk;

import java.util.Scanner;

public class Hw02 {

    public static void main(String[] args) {

        System.out.println("----------------Q1----------------------");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of your birthday ");
        int day = scanner.nextInt();
        System.out.println("Enter the month of your birthday ");
        int month = scanner.nextInt();
        boolean control0 = false;

        switch (month) {

            case 1:

                if (day >= 1 && day <= 21) {

                    System.out.println("Capricorn");
                    control0 = true;

                } else if (day >= 22 && day <= 31) {

                    System.out.println("Aquarius");
                    control0 = true;
                }

                break;
            case 2:
                if (day >= 1 && day <= 21) {

                    System.out.println("Aquarius");
                    control0 = true;

                } else if (day >= 22 && day <= 28) {

                    System.out.println("Pisces");
                    control0 = true;
                }

                break;
            case 3:
                if (day >= 1 && day <= 21) {

                    System.out.println("Pisces");
                    control0 = true;

                } else if (day >= 22 && day <= 31) {

                    System.out.println("Aries");
                    control0 = true;
                }

                break;
            case 4:
                if (day >= 1 && day <= 21) {

                    System.out.println("Aries");
                    control0 = true;

                } else if (day >= 22 && day <= 30) {

                    System.out.println("Taurus");
                    control0 = true;
                }

                break;
            case 5:
                if (day >= 1 && day <= 21) {

                    System.out.println("Taurus");
                    control0 = true;

                } else if (day >= 22 && day <= 31) {

                    System.out.println("Gemini");
                    control0 = true;
                }

                break;
            case 6:
                if (day >= 1 && day <= 21) {

                    System.out.println("Gemini");
                    control0 = true;

                } else if (day >= 22 && day <= 30) {

                    System.out.println("Cancer");
                    control0 = true;
                }

                break;
            case 7:
                if (day >= 1 && day <= 21) {

                    System.out.println("Cancer");
                    control0 = true;

                } else if (day >= 22 && day <= 31) {

                    System.out.println("Leo");
                    control0 = true;
                }

                break;
            case 8:
                if (day >= 1 && day <= 21) {

                    System.out.println("Leo");
                    control0 = true;

                } else if (day >= 22 && day <= 31) {

                    System.out.println("Virgo");
                    control0 = true;
                }

                break;
            case 9:
                if (day >= 1 && day <= 21) {

                    System.out.println("Virgo");
                    control0 = true;

                } else if (day >= 22 && day <= 30) {

                    System.out.println("Libra");
                    control0 = true;
                }

                break;
            case 10:
                if (day >= 1 && day <= 21) {

                    System.out.println("Libra");
                    control0 = true;

                } else if (day >= 22 && day <= 31) {

                    System.out.println("Scorpio");
                    control0 = true;
                }

                break;
            case 11:
                if (day >= 1 && day <= 21) {

                    System.out.println("Scorpio");
                    control0 = true;

                } else if (day >= 22 && day <= 30) {

                    System.out.println("Sagittarius");
                    control0 = true;
                }

                break;
            case 12:
                if (day >= 1 && day <= 21) {

                    System.out.println("Sagittarius");
                    control0 = true;

                } else if (day >= 22 && day <= 31) {

                    System.out.println("Capricorn");
                    control0 = true;
                }

                break;

            default:
                control0 = false;

                break;
        }

        System.out.println("----------------Q2----------------------");

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int counter = 0;

        while (true) {


            if (num % 5 == 0) {
                num = num / 5;
                counter++;

            } else if (num == 1) {

                System.out.println("This number is a power of 5.");
                break;

            } else {
                System.out.println("This number is not a power of 5.");
                break;
            }
        }
        System.out.println("The number " + num + " is divisible by 5 up to " + counter + " .");


    }

}