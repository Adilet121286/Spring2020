package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine(); // accepts the "Enter"

        System.out.println("Your full name is: "+fullName);

        System.out.println("Enter your sentences:");
        String sentence = scanner.nextLine();
        System.out.println("You entered"+sentence);
    }
}
