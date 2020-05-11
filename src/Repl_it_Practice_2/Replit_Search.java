package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Collections;

public class Replit_Search {
    public static String search(ArrayList<String> r, String find)
    {


        String result = "";
        for (int i=0;i<r.size();i++){
            String str = r.get(i);

            if (  !str.contains(find)  ){
                result = "search failed";
            }
            if (str.contains(find)){
                result =str;
                break;


            }

        }
        return result;



    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}
