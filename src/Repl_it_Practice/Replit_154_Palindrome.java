package Repl_it_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_154_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

        String num1 = ""+num;
        String reversed = "";

        for (int i=num1.length()-1; i>=0;i--) {
            reversed += num1.charAt(i);

        }
        System.out.println(reversed.equals(num1));





    }
}
