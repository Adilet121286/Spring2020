package Repl_it_Practice;
/*
    Let's say I've got a 100$ gift card and you want to buy something in your online store .
    Write a program that will help me to buy something and display leftover balance after purchase.
    If item is not in the list, display message: "Invalid item!".
    If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".

Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
 */

import java.util.Scanner;

public class Replit_035_GiftCard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE


        int giftCardBalance = 100;


        if (item.equalsIgnoreCase("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");

        }else if (item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");

        }else if (item.equalsIgnoreCase("Charger")){
            int itemprice = 15;
            int currentBalance = giftCardBalance-itemprice;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+currentBalance+"$");

        }else if (item.equalsIgnoreCase("USB cable")){
            int itemprice = 10;
            int currentBalance = giftCardBalance-itemprice;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+currentBalance+"$");

        }else if (item.equalsIgnoreCase("Headphones")){
            int itemprice = 30;
            int currentBalance = giftCardBalance-itemprice;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+currentBalance+"$");

        }else if (item.equalsIgnoreCase("Pants")){
            int itemprice = 50;
            int currentBalance = giftCardBalance-itemprice;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+currentBalance+"$");

        }else if (item.equalsIgnoreCase("Hat")){
            int itemprice = 25;
            int currentBalance = giftCardBalance-itemprice;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+currentBalance+"$");

        }else if (item.equalsIgnoreCase("Socks")){
            int itemprice = 5;
            int currentBalance = giftCardBalance-itemprice;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+currentBalance+"$");

        }else if (item.equalsIgnoreCase("Blanket")){
            int itemprice = 60;
            int currentBalance = giftCardBalance-itemprice;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+currentBalance+"$");

        }else if (item.equalsIgnoreCase("Pillow")){
            int itemprice = 40;
            int currentBalance = giftCardBalance-itemprice;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+currentBalance+"$");

        }else {
            System.out.println("Invalid item!");
        }



    }
}
