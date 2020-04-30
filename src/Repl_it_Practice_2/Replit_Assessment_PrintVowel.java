package Repl_it_Practice_2;

import java.util.Scanner;

public class Replit_Assessment_PrintVowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String result = "";

        for (int i=0; i<word.length();i++) {
            char ch = word.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                result +=ch;
            }

        }
        System.out.println(result);



    }
}
