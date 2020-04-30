package Repl_it_Practice;

public class Replit_162_3LocksGates {

    public static void main(String[] args) {

        boolean result2 = threeLocks(false,false,false);
        System.out.println(result2);

    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        boolean result = true;
        if(a==true && b==true && c==false){
            result = true;

        }else if (a==true && c==true && b==false){
            result = true;

        }else if (c==true && b==true && a==false){
            result=true;

        }else {
            result = false;
        }
        return result;



    }//end threeLocks
}
