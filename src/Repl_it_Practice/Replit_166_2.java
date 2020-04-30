package Repl_it_Practice;

public class Replit_166_2 {

    public static void main(String[] args) {

        String one = "Adilet";
        String two = "Cybertek";

        String result = mergeStrings(one,two);
        System.out.println(result);

    }

    public static String mergeStrings(String one, String two) {

        String string = "";
        for (int i=0; i<one.length() || i <two.length(); i++){

            if (i < one.length()){
                string += one.charAt(i);
            }
            if (i<two.length()){
                string +=two.charAt(i);
            }

        }

        return string;


    }
}
