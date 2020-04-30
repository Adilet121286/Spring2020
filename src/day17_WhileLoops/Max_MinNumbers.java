package day17_WhileLoops;

import java.util.Scanner;
/*
    1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
 */

public class Max_MinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int MaxNumber = -99999999;

        int MinNumber = 1999999999;

        for (int i=1; i<=5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if(num>MaxNumber){
                MaxNumber = num;
            }

            if (num < MinNumber){
                MinNumber = num;
            }

        }

        System.out.println(MaxNumber);
        System.out.println(MinNumber);




    }

}
