package Repl_it_Practice;

import java.util.Scanner;

public class Replit_139_Method1SimpleCalculator {
    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("enter second number:");
        int num2 = scanner.nextInt();

        int result = num1+num2;
        System.out.println(result);


    }

}
