package Repl_it_Practice;

import java.util.Scanner;

public class Replit_115_FindMaxLength {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        String longestWord = " ";
        for (int i = 0; i < words.length; i++ ){
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];

            }

        }
        System.out.println(longestWord);


    }

}
