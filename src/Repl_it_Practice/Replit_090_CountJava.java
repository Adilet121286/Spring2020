package Repl_it_Practice;

import java.util.Scanner;

public class Replit_090_CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        String result = "";

        int count = 0;
        while (word.contains("java")){

            count++;
            word = word.replaceFirst("java", " ");

        }
        System.out.println(count);




    }
}
