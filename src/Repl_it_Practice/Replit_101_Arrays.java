package Repl_it_Practice;

import java.util.Scanner;

public class Replit_101_Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        // TODO: Write your code below

        String result="";
        for(int i = 0; i<words.length; i++){

            String eachWord = words[i];
            result = eachWord.charAt(0) +""+ eachWord.charAt(eachWord.length()-1);
            System.out.println(result);


        }


    }
}
