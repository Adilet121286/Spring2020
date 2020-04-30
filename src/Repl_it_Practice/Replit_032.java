package Repl_it_Practice;
/*
    Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.
 */

import java.util.Scanner;

public class Replit_032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;

        System.out.println("Enter seconds:");

        int inputSeconds = scanner.nextInt();

        hours = inputSeconds / 3600;
        minutes = (inputSeconds % 3600) / 60;
        seconds = (inputSeconds % 3600) % 60;

        String result = hours + " hours, "+minutes+" minutes, "+seconds+" seconds";

        System.out.println(result);






    }
}
