package Repl_it_Practice;

public class Replit_167_3 {

        public static void main(String[] args) {
            //test your code
            String str=uniqueChars("BugBusters");
            System.out.println( uniqueChars("BugBusters") ) ;
        }

        public static String uniqueChars(String str) {
            //TODO: write your below
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!result.contains("" + ch)) {
                    result += ch;
                }
            }
            return result;
        }




}


