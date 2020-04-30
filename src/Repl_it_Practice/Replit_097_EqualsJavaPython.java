package Repl_it_Practice;

import java.util.Scanner;

public class Replit_097_EqualsJavaPython {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String sentence = scan.nextLine();

            String[] Sentence = sentence.split(" ");


            int countJava = 0;
            int countPython = 0;

            for (String eachWord: Sentence){

                if(eachWord.contains("java")){
                    countJava++;
                }else if (eachWord.contains("python")){
                    countPython++;
                }
            }
            System.out.println(countJava == countPython);


    }
}
