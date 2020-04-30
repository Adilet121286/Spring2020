package Repl_it_Practice;

import java.util.Scanner;
/*
Write a program that asks user to input int values: Replit_023 and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
 */

public class Replit_023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int areaCode;
        int localNumber;
        String phoneNumber;

        System.out.println("Enter the area code:");
        areaCode = scanner.nextInt();
        System.out.println("Enter the local number:");
        localNumber = scanner.nextInt();
        phoneNumber = "("+areaCode+") - "+localNumber;
        System.out.println("Calling number "+phoneNumber);

    }
}
