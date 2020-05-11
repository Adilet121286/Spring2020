package Repl_it_Practice_2;

import java.util.Arrays;

public class Replit_CombineToFullName {

    public static String[] combineNames(String[] first_names, String[] last_names) {

        for (int i=0; i<last_names.length;i++){
            first_names[i] +=" "+last_names[i];
        }

        return first_names;

    }


    public static void main(String[] args) {
        //feel free to test code here
        String[] first_names = {"bob","joe"};
        String[] last_names = {"jones","smith"};

        System.out.println(  Arrays.toString(combineNames(first_names,last_names))  );






    }
}
