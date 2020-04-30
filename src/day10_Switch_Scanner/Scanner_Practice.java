package day10_Switch_Scanner;
import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");

        int num1 = input.nextInt();

        System.out.println("Enter your second number:");

        int num2 = input.nextInt();

        System.out.println("The sum of those two numbers is: " + (num1+num2));


    }
}
