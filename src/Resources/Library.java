package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int[] sortDesending (int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String ReverseString (String str){  // can reverse a string and returns string
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }

    public static String remomingStringDulicate(String string){

        String result = "";
        for (int i=0;i<string.length(); i++){

            char ch = string.charAt(i);
            if (!result.contains(""+ch)){
                result += ch;
            }

        }
        return result;



    }

    public static int Frequency(String str1, String str2){
        int count = 0 ;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
    }

    public static String FrequencyOfChars (String str){

        String nonDupl = Library.remomingStringDulicate(str);

        String result = "";

        for (int i =0; i<nonDupl.length(); i++) {

            String ch = "" + nonDupl.charAt(i);
            int num = Library.Frequency(str, ch);
            result +=ch+num;
        }
        return result;
    }

    public static int Frequency (String str, char ch){

        char[] arr = str.toCharArray();
        int count = 0;
        for(char each : arr){
            if (each == ch){
                count++;
            }

        }
        return count;
    }

    public static int MaximumNumber (ArrayList<Integer> list){

        int max = Integer.MIN_VALUE;

        for (int i=0;i<list.size();i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }


    // remove duplicates from string

    // Frequency of string

    // merge two array and return third one

    // max number from array

    // min number from array



}
