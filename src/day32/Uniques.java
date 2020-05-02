package day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        Character[] chars={'A','A','B','C','D','D',};

        ArrayList<Character> charList = new ArrayList<Character>(Arrays.asList(chars));
        System.out.println(charList);


        ArrayList<Character> result = new ArrayList<>();

        for (int i=0; i<charList.size();i++){
            int count = Collections.frequency(charList, charList.get(i));
            if (count ==1){
                result.add(charList.get(i));
            }

        }
        System.out.println(result);
        System.out.println("==================");

        ArrayList<Character> result2 = new ArrayList<>();
        for (char each: charList){
            int count2 = Collections.frequency(charList,each);
            if (count2 ==1){
                result2.add(each);

            }

        }
        System.out.println(result2);


    }
}
