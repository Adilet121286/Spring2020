package Repl_it_Practice_2;

public class Replit_172_AtThirdChar {
    public static void main(String[] args) {
        String target = "blabla";
        String word = "a";
        String result = at3(target,word);
        System.out.println(result);


    }


    public static String at3(String target,String word) {

        String first3letter = target.substring(0,3);
        String after3letter = target.substring(3,target.length());
        String conbinedWord = first3letter+word+after3letter;
        return conbinedWord;

    }
}
