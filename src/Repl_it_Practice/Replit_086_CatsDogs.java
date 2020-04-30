package Repl_it_Practice;

import java.util.Scanner;

public class Replit_086_CatsDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        while (word.contains("cat")){
            countOfCats++;
            word = word.replaceFirst("cat", " ");
        }
        while (word.contains("dog")){
            countOfDogs++;
            word = word.replaceFirst("dog", " ");
        }

        System.out.println(countOfCats ==countOfDogs);





    }
}
