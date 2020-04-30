package Repl_it_Practice;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class AAAAAAAAAAAAAAAAAAA {

    public static void main(String[] args) {
       String word = "I am a student of Cybertek";
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



