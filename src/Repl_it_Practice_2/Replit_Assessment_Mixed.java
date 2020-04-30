package Repl_it_Practice_2;

import java.util.Scanner;

public class Replit_Assessment_Mixed {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below


       String result="";

       for (int i=0; i<s.length();i++) {
            if (i%2 !=0){
               String up =  s.substring(i,i+1).toUpperCase();
               result += up;
            }else {
                String low = s.substring(i,i+1).toLowerCase();
                result+=low;
            }
       }
        System.out.println(result);


    }
}
