package Repl_it_Practice_2;

public class Replit_189_FindErrorString {
    public static void main(String[] args) {
        String words = "foo bar error";
        System.out.println(isError(words));


    }


    public static boolean isError(String line) {

        if (line.startsWith("error")){
            return true;
        }else {
            return false;
        }

    }
}
