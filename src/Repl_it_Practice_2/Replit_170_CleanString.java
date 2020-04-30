package Repl_it_Practice_2;

public class Replit_170_CleanString {



    public static String clean (String text ,String badWord) {
        return(text.replace(badWord,""));

    }

    public static void main(String[] args) {
        String text = "he said bla bla bla";
        String badword = "bla";
        String textWithoutBW = clean(text,badword);
        System.out.println(textWithoutBW.trim());


    }
}
