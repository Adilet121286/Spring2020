package Repl_it_Practice_3;

import java.util.Scanner;

public class Plural {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:
        String plural = "";
        if(amt == 1){
            plural = amt +" "+word;
        }else if(amt == 0 || amt >= 2){
            if(word.endsWith("fe")){
                plural = amt+" "+word.substring(0,word.length() - 2) + "ves";
            }else if(word.endsWith("sh") || word.endsWith("ch")){
                plural = amt +" "+ word + "es";
            }else if(word.endsWith("us")){
                plural = amt+" "+word.substring(0,word.length()- 2) + "i";
            }else if(word.endsWith("y")){
                if(word.endsWith("ay") || word.endsWith("uy")
                        || word.endsWith("oy") || word.endsWith("ey")){
                    plural = amt+" "+word+"s";
                }else{
                    plural = amt+" "+word.substring(0,word.length()-1) + "ies";
                }
            }else{
                plural = amt +" "+word+"s";
            }
        }
        System.out.println(plural);
    }


}
