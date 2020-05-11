package Repl_it_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_RemoveAllMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("hi","hey","hi","yo"));

        removeAll(list,"hi");
        System.out.println(list);

    }



    public static void removeAll(ArrayList<String> wordList, String targetWord){
        wordList.removeAll(Arrays.asList(targetWord));

    }
}
