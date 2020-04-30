package Repl_it_Practice_2;

public class Replit_174_RemoveFirstChar {
    public static void main(String[] args) {

        System.out.println(removeFirst("aaa"));

    }


    public static String removeFirst(String target) {
        String string = target.substring(1,target.length());
        return string;

    }
}
