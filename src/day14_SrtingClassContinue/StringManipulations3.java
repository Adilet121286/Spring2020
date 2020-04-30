package day14_SrtingClassContinue;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1.equals(str2));      // false

        System.out.println(str1.equalsIgnoreCase(str2));        // true, ignores case sensitivity.

        String s1 = "Cybertek School";
            boolean r1 = s1.contains("School");      // true

        System.out.println(r1);
        System.out.println("============================");


        /*
        valid password MUST contain a spesial characters such as (!, _, $)
        valid password should not contain space
         */


        String PassWord = "mmasd1235";

        if (PassWord.contains(" ")){
            System.out.println("password cannot have space in it!");
        }else {
            System.out.println("valid password");
        }

        String s3 = "United States";
        System.out.println(s3.startsWith("U"));


    }
}
