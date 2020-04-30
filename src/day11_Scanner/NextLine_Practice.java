package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt(); // 30 + Enter
        System.out.println("Your age is: "+age);

        scanner.nextLine();

        System.out.println("enter your full name: ");
        String fullName = scanner.nextLine(); //
        System.out.println("Your full name is: "+fullName);
    }
}
