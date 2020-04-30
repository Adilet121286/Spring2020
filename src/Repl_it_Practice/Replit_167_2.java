package Repl_it_Practice;

public class Replit_167_2 {
    public static void main(String[] args) {
        //test your code

        String string = uniqueChars("BugBusters");
        System.out.println( string ) ;
    }


    public static String uniqueChars(String str) {
        //TODO: write your below
        String result = "";
        for (int i=0; i<str.length(); i++){
            if ( !result.contains(""+str.charAt(i)) ){
                result +=str.charAt(i);
            }

        }
        return result;

    }
}
