package Repl_it_Practice_2;

public class Replit_173_BiggerString {
    public static void main(String[] args) {
        System.out.println(biggerS("apple","orange"));
    }

    public static String biggerS(String a ,String b) {

        if (a.length()>b.length()){
            return a;
        }else {
            return b;
        }


    }
}
