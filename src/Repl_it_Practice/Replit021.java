package Repl_it_Practice;

import java.util.Scanner;
/*
In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"
 */

public class Replit021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        System.out.println("Enter 3 numbers:");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        sum = num1+num2+num3;
        System.out.println("Sum of numbers: "+sum);

    }
}
