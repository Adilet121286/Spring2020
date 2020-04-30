package day16_ForLoop;

import java.util.Scanner;

public class PalindrovaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String word = input.nextLine();  //Java

        String reversedWord="";

        for (int i = word.length()-1; i >=0; i-- ){
            reversedWord +=word.charAt(i);

        }

        boolean palindrome = word.equalsIgnoreCase(reversedWord);

        System.out.println(palindrome);



    }
}
