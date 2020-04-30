package Repl_it_Practice_2;

public class Replit_171_LimitString {
    public static void main(String[] args) {
        String word = "bla bla";
        int num = 3;

        String result = limit(word,num);
        System.out.println(result);


    }

    public static String limit(String text, int maxLength) {

        String string = "";

        for (int i=0; i < maxLength; i++){

            string += text.charAt(i);

        }
        return  string;


    }
}
