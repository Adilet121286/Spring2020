package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Enter a long number");
        long a = scanner.nextLong();
        System.out.println("You entered: ");

        double dNum = scanner.nextDouble();

        System.out.println(dNum);

        System.out.println("Enter boolean:");
        boolean bNum = scanner.nextBoolean();
        System.out.println("you entered: "+ bNum);
        */
        System.out.println("enter words:");
         String str = scanner.next();
        System.out.println("you entered: "+ str);


    }
}
