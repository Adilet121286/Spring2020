package Repl_it_Practice;

public class Replit_160_Hamlet_Logic {
    public static void main(String[] args) {
        boolean toBe = true;
        boolean notToBe = false;
        boolean result2 = hamletQuote(toBe,notToBe);
        System.out.println(result2);

    }


    public static boolean hamletQuote(boolean toBe,boolean notToBe){


        if (toBe == false && notToBe == false){
            return false;
        }else{
            return true;
        }

    }
}
