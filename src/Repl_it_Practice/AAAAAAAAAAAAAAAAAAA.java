package Repl_it_Practice;

import java.util.Arrays;
class Main {
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()){
            return  false;
        }
        word1 =word1.toLowerCase();
        word2=word2.toLowerCase();
        char[] ch1 =word1.toCharArray();
        char[] ch2 =word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        if (Arrays.equals(ch1,ch2)){
            return true;
        }else {
            return false;
        }
    }
}


