package Repl_it_Practice_2;

public class Replit_194_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses Run".replace(" ","")));

    }


    public static boolean isPalindrome(String check) {
        String kcehc="";
        String check1=check.replaceFirst(" ","");
        for (int i=check1.length()-1; i>=0; i--){
            kcehc+=check1.charAt(i);
        }
        if (check1.equalsIgnoreCase(kcehc)){
            return true;
        }else {
            return false;}


    }

}
