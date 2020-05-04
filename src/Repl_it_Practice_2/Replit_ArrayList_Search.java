package Repl_it_Practice_2;

import java.util.ArrayList;

public class Replit_ArrayList_Search {
    public static String search(ArrayList<String> r, String find)
    {

        String result ="";
        for (int i=0; i<r.size();i++){
            if (r.get(i).contains(find)){
                result = r.get(i);
            }else {
                result ="search failed";
            }
        }
        return result;



    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}
