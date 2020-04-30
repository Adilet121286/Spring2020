package Repl_it_Practice;
/*
    Write a switch statement that tests the value of the char variable response and performs
    the following actions:

if response is y, the message Your request is being processed is printed
if response is n, the message Thank you anyway for your consideration is printed
if response is h, the message Sorry, no help is currently available is printed
for any other value of response, the message "Invalid entry, please try again!" is printed

Create Scanner object.
Use charAt() method, in order to get the char value at the specified index.

Example:

-Display prompt: "Enter command:"
input: y
-Display prompt: "Your request is being processed"
 */

import java.util.Scanner;

public class Repit_050_SwitchCharStatement {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE HERE
        String message = " ";

        switch (response ){
            case 'y':
                message = "Your request is being processed";
                break;
            case 'n':
                message = "Thank you anyway for your consideration";
                break;
            case 'h':
                message = "Sorry, no help is currently available";
                break;
                default:
                    message = "Invalid entry, please try again!";



        }
        System.out.println(message);


    }

}
