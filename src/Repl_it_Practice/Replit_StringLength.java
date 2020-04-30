package Repl_it_Practice;

import java.util.Scanner;

public class Replit_StringLength {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int length = name.length();
        System.out.println(length);
        */
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        char ch1 = txt.charAt(2);
        char ch2 = txt.charAt(4);
        char ch3 = txt.charAt(5);

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);

    }

}
