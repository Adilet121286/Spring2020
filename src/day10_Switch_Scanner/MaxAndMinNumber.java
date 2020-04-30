package day10_Switch_Scanner;


import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();
        System.out.println("You entered all three numbers");
        System.out.println("=====================================");



        int result = (num1>num2 && num1>num3)? num1 : (num2>num1 && num2>num3) ? num2 :  num3;
        System.out.println("The maximum number is: "+result);

        int result2 = (num1<num2 && num1<num3)? num1 : (num2<num1 && num2<num3) ? num2 :  num3;
        System.out.println("The minimum number is: "+result2);


    }
}