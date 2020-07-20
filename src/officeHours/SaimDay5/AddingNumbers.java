package officeHours.SaimDay5;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingNumbers {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        System.out.println(sumElements(array1));

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3,4,5,6,7));
        System.out.println(sumElements(list1));

        int[] arrr = {2,4,1,5,6,3};
        System.out.println(Arrays.toString(reverse(arrr)));





    }



    public static int sumElements(int[] arr) {
        int result = 0;

        for (int each: arr){

            result +=each;
        }
        return result;


    }


    public static int sumElements(ArrayList<Integer> list) {
        int resultlist = 0;

        for (int i=0;i<list.size();i++){
            resultlist += list.get(i);
        }
        return resultlist;


    }

    public static int[] reverse(int [] array){

        for (int i=0;i<array.length;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

        return array;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list){

        ArrayList<Integer> rev = new ArrayList<>();


        for (int i = list.size()-1; i >= 0; i--){
            rev.add(list.get(i));

        }
        return rev;


    }



}
