package Repl_it_Practice_2;

public class Replit_186_ExtraNumber {
    public static void main(String[] args) {
        System.out.println(extractNum("aa2dd3d"));
    }


    public static String extractNum(String s) {
        String extraDijit = "";
        for (int i=0; i<s.length();i++){
            if ( Character.isDigit(s.charAt(i)) ){
                extraDijit +=s.charAt(i);
            }
        }
        return extraDijit;

    }


}
