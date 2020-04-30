package day20_ArrayContiniue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String name = "Muhtar";

        char[] ch1 = name.toCharArray();

        System.out.println(Arrays.toString(ch1));

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] ch2 = str1.toCharArray();
        char[] ch3 = str2.toCharArray();

        System.out.println(Arrays.toString(ch2));
        System.out.println(Arrays.toString(ch3));


    }
}
