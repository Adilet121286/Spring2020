package Repl_it_Practice_2;

public class Replit_179_ReverseString {

    public static void main(String[] args) {
        String word = "Adilet";
        String result = reverse(word);
        System.out.println(result);
    }

    public static String reverse(String input) {

        String reversed = "";

        for (int i=input.length()-1; i>=0; i--){
            reversed += input.charAt(i);
        }

        return reversed;


    }
}
