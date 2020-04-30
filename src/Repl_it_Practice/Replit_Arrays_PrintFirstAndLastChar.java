package Repl_it_Practice;

import java.util.Scanner;

public class Replit_Arrays_PrintFirstAndLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String FirstAndLast = "";
        for (int i = 0; i<words.length; i++){

            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length()-1);
            FirstAndLast = first+""+last;
            System.out.println(FirstAndLast);

        }




    }
}
