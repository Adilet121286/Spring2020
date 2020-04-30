package Repl_it_Practice;

import java.util.Scanner;

public class Replit_153_PrintUniqueWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for (String each : words){

            int count = 0;
            for (int i=0; i<words.length; i++){
                String s1 = words[i];
                if (s1.equals(each)){
                    count++;
                }
            }
            if (count ==1){
                System.out.println(each);
            }

        }






    }
}
