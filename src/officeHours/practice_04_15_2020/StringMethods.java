package officeHours.practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cybertek";

        char[] ch1 = str.toCharArray();

        System.out.println(str.length() == ch1.length);


        String str1 = "ABCD";
        String str2 = "BAC";

        char ch2[] = str1.toCharArray();
        char[] ch3 = str2.toCharArray();

        Arrays.sort(ch2);
        Arrays.sort(ch3);

        System.out.println(Arrays.equals(ch2,ch3));

        System.out.println("===================================================");

        String sentence = "I like to learn java";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        int totalNumWords = words.length;
        System.out.println(totalNumWords);

        for (int i = words.length-1; i >=0; i--){
            System.out.print(words[i] + " ");
        }


    }
}
