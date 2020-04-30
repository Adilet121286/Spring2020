package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AABBCC"; // A2B2C2
        String nonDupl = Library.remomingStringDulicate(str);

        String result = "";

        for (int i =0; i<nonDupl.length(); i++) {

            String ch = "" + nonDupl.charAt(i);
            int num = Library.Frequency(str, ch);
            result +=ch+num;
        }
        System.out.println(result);






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
}
