package Repl_it_Practice_2;

import java.util.ArrayList;

public class aaa {
    public static void main(String[] args) {

        String s = "ds12ddd4f5";


        char[]ch = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        String result = "";

        for (Character each: ch){
            list.add(each);
            if (each.isDigit(each)){
                result +=each;
            }

        }
        System.out.println(result);


    }
}
