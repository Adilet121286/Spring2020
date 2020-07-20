package officeHours.SaimDay5;

import java.util.ArrayList;
import java.util.Arrays;

public class SookPractice2 {



     /*
    1) Create a method that will accept an int array
     and return the sum of all the numbers in the given array
    2) Overload the method to accept an ArrayList of integers
    and return the sum of all the numbers in the given ArrayList
     */

    public static void main(String[] args) {

        int [] array = {2,4,5,1};


        int sumOfElements=0;//2 6 11 12
        for (int eachNum : array){   //(1) (2)
            sumOfElements  = sumOfElements + eachNum;

        }

        System.out.println(sumOfElements);

        int[] asd = {2,4,6,7,8};
        int a = totalSum(asd);

        System.out.println(a);
        System.out.println("===========");


        ArrayList<Integer> ddd = new ArrayList<>(   Arrays.asList(1,2,3,2,1) );
        int s = totalSum(ddd);
        System.out.println(s);




    }


    // static because we can call directly to main method and in our class there is no istance variables that we need use in our method
    public static int totalSum(int[] array1){


        int sum = 0;
        for (int i=0; i<array1.length; i++){
            sum = sum + array1[i];
        }

        return sum;

    }

    public static int totalSum(ArrayList<Integer> list){

        int sumList = 0;
        for (int i = 0; i<list.size(); i++){
            sumList = sumList + list.get(i);
        }
        return sumList;

    }


}
