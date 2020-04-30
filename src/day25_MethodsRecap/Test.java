package day25_MethodsRecap;

import Resources.Library;

public class Test {
    public static void main(String[] args) {

        String str = "AKSMNDDHDUDID";
        Library.remomingStringDulicate(str);

        System.out.println(str);

        String str1 = "ADGJDHDHDHDCL";
        String str2 = "D";

        int num1 = Library.Frequency(str1,str2);

        System.out.println(num1);

        String str3 = "cccccjjjjjjjssssddddoooodssss";
        String str4 = Library.FrequencyOfChars(str3);

        System.out.println(str4);


    }
}
