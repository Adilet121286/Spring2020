package day14_SrtingClassContinue;

import java.util.Scanner;

public class Credentials2 {
    /*
            valid credentials are:
                username: cybertek
                password: cybertekschool


     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your username:");
        String inputUsername = input.next();

        System.out.println("enter the password:");
        String inputPassword = input.next();

        boolean logedIn = inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");

        boolean invalidUserName = !inputUsername.equals("Caybertek") && inputPassword.equals("cybertekschool");

        boolean invaledPassword = inputUsername.equals("Caybertek") && !inputPassword.equals("cybertekschool");

        if (!inputUsername.isEmpty() && !inputPassword.isEmpty()){      // are not empty

            if (logedIn){
                System.out.println("Logged in");
            }else if (invalidUserName){
                System.out.println("Password is correct, but username is incorrect");
            }else if(invaledPassword){
                System.out.println("Username is correct, but password is incorrect");
            }else {
                System.out.println("Both of them incorrect");
            }


        }else {
            System.out.println("Please, enter the credentials");
        }

    }
}
