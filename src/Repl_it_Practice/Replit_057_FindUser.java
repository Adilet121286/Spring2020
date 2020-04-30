package Repl_it_Practice;

import java.util.Scanner;

public class Replit_057_FindUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Enter full name:");
        String fullUserName = scan.nextLine();

        String result = (fullUserName.equalsIgnoreCase("Max Payne") ||
                fullUserName.equalsIgnoreCase("Alan Wake")) ?
                "User found!" : "User not found!";
        System.out.println(result);




    }
}
