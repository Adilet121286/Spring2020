package day14_SrtingClassContinue;

import java.util.Scanner;
/*
            userName: cybertek
            passWord: cybertekshool
 */

public class Cridentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ValidUserName = "cybertek";
        String ValidPassWord = "cybertekschool";

        System.out.println("enter your username:");
        String inputUsername = input.next();

        System.out.println("enter the password:");
        String inputPassword = input.next();

        if (inputUsername.equals(ValidUserName) && inputPassword.equals(ValidPassWord)){
            System.out.println("Log in successfully");
        }else {
            System.out.println("Invalid credentials");
        }


    }
}
