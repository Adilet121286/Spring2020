package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildanimal = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};


        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};
        //                  0          1        2           3

        String[][] zoo = {wildanimal, birds};
        //                  0           1

        String kfc = zoo [1][3];

        System.out.println(kfc);
        System.out.println("==================================");

        for (String eachBird : zoo[1]){

            if (eachBird.equals("Chicken")){
                continue;
            }

            System.out.println(eachBird);
        }


        for (String eachWildEnimal: zoo[0]){
            if (eachWildEnimal.equals("Turtle")){
                continue;
            }

            System.out.print(eachWildEnimal+" ");
        }



    }
}
