package Repl_it_Practice_2;

public class Replit_209_plusMinus {
    public static void main(String[] args) {

        System.out.println("1+1 = "+calc.plus(1,1) );
        System.out.println("1-1 = "+calc.minus(1,1) );

    }
}

class calc{
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }

}
