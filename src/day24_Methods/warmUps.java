package day24_Methods;

import java.util.Scanner;

/*
    1. write a methods that can return the maximum number between two numbers
            Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator,
	and prints out the calculation
        if operator is not between [-, +, *, /, %] output should be Invalid Operator
        Ex: calculate(10, 2, '*') ==> 20;
            calculate(10, 2, '&') ==> Invalid operator
            NOTE: The method MUST take three arguments when it's called
    3. write a method that can identify if a string is palindrome
            ex: palindrom("level")  ==> true
                palindrome("Cybertek") ==> false
 */


public class warmUps {
    public static void Max(int num1, int num2 ){

        if(num1>=num2){
            System.out.println("Maximum number is: "+num1);
        }else{
            System.out.println("Maximum number is: "+num2);
        }

    }

    //                                     10           20           *
    public static void Calculation(double num1, double num2, char operator){

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;

            case '*':
                System.out.println(num1*num2);
                break;

            case '/':
                System.out.println(num1/num2);
                break;

            case '%':
                System.out.println(num1%num2);
                break;

            default:
                System.out.println("Invalid");

        }


    }



    public static void main(String[] args) {
        int a = 1000000;
        int b = 200;

        Max(a,b);

        Calculation(10,20,'*');

        Calculation(30, 40, '+');

        int n1 = 10000;
        int n2 = 100;

        Calculation(n1,n2, '/');

        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();
            System.out.println("Enter operator: ");
            char operator = scan.next().charAt(0);
            Calculation(num1, num2, operator);  // result of calculation
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))  ){
                System.out.println("Invalid Entry, Please re-enter");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("No")){
                break;
            }

        }


        //   method("Muhtar");

    }




    public static void method(String name){

    }


}



