package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Replit_ExtractNumberFromString {
    public static String extractNum(String s) {

        char[]ch = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        String result = "";
        for (Character each: ch){
            if (each.isDigit(each)){
                result +=each;
            }
        }


        return result;

    }

}
