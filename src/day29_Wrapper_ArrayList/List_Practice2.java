package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
         */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(500);
        list.add(10);

        int max = Integer.MIN_VALUE;

        for (int i=0;i<list.size();i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }


        System.out.println(max);
        System.out.println("=============");

        int max2 = list.get(0);

        for (int each: list){
            if (each>max2){
                max2=each;

            }
        }
        System.out.println(max2);
        System.out.println("=========");

        int maxNum1 = MaximumNumber(list);
        System.out.println(maxNum1);



    }

    public static int MaximumNumber (ArrayList<Integer> list){

        int max = Integer.MIN_VALUE;

        for (int i=0;i<list.size();i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }

}
