package day33_CustomClass;

import java.util.ArrayList;

public class WarmUp_ExtraChar2 {
    public static void main(String[] args) {
        String  str = "ABCD123$%#@&456EFG!";


        ArrayList<Character> letters = new ArrayList<>();  // isLetter()
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (int i=0; i<str.length();i++){
            char each = str.charAt(i);
            if( Character.isLetter(each) ){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }

        }


        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);

    }
}
