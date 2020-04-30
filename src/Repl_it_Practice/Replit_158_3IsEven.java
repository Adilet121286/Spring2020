package Repl_it_Practice;

public class Replit_158_3IsEven {
    public static boolean isEven(int n){

        if (n%2==0){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        boolean result = isEven(0);
        System.out.println(result);

    }
}
