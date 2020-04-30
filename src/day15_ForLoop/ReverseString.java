package day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Java is fun";

        int lastIndex = str.length()-1;

        for (int i = lastIndex; i>=0; i--){
            System.out.print(str.charAt(i));

        }

    }
}
