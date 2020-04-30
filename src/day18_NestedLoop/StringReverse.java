package day18_NestedLoop;

public class StringReverse {

    public static void main(String[] args) {

        String word = "Java";
        String reverse = "";
        int lastIndax = word.length()-1;

        do {

            reverse += word.charAt(lastIndax);

            lastIndax--;
        }while (lastIndax >=0);

        System.out.println(reverse);

    }

}
