package Repl_it_Practice_2;

public class Replit_194_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses Run".replace(" ","")));

    }


    public static boolean isPalindrome(String check) {
        String reverse="";
        for (int i=check.length()-1;i>=0;i--){
            reverse +=check.charAt(i);
        }

        return reverse.equalsIgnoreCase(check);


    }

}
