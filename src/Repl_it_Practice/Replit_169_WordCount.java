package Repl_it_Practice;

public class Replit_169_WordCount {

    public static void main(String[] args) {

        System.out.println(wordCount("foo bar"));

    }

    public static int wordCount(String words) {

        String[] array = words.split(" ");

        int count = array.length;

        return count;

    }
}
