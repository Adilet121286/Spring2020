package Repl_it_Practice_3;

import java.util.Scanner;

public class Pluralizer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:

        String string =amt+" ";

        if (amt>1 || amt == 0){

            if (    word.endsWith("fe")    ){
                string += word.replace(  word.substring(word.length()-2, word.length()),"ves"    );
            }else if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("oy")
                    && !word.endsWith("ey") && !word.endsWith("uy") ){
                string += word.replace(  word.substring(word.length()-1, word.length()),"ies"    );
            }else if (word.endsWith("sh") || word.endsWith("ch")){
                string += word.concat("es");
            }else if (word.endsWith("us")) {
                string += word.replace(word.substring(word.length() - 2, word.length()), "i");

            }else {
                string += word.concat("s");
            }


        }else {
            string +=word;
        }

        System.out.println(string);



    }
}
