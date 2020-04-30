package Repl_it_Practice_2;

import java.util.ArrayList;

public class Replit_181_Combine {
    public static void main(String[] args) {

        String[] s1 = {"f","o","o"};
        String[] s2 = {"b", "a", "r"};

        String result = combineRs(s1,s2);
        System.out.println(result);


    }



    public static String combineRs(String[] r1,String[] r2) {

        ArrayList<String> list = new ArrayList<>();
        String result = "";

       for (String each: r1){
           list.add(each);


       }
       for (String each: r2){
           list.add(each);
       }





       return result;



    }
}
