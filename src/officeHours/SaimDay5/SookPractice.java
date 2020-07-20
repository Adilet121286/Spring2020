package officeHours.SaimDay5;

import java.util.Arrays;

public class SookPractice {

    public static void main(String[] args) {

        int [] array = { 1, 2, 3, 4, 5,};
        //               0  1  2  3  4

        int[] reverse = new int[array.length];


        int j = 0;// j=1
        for(int i = array.length-1; i>=0;i--){
            reverse[j] = array[i];
            j++;




        }



        int [] array2 = {1,2,3,4};
        //               0 1 2 3


        for (int i=0; i<array2.length/2; i++){
            int temp = array2[i]; // (1) = 1 , (2) = 2

            array2[i] = array2[array2.length-1-i];// 4-i, i=0 4-0=4

            array2[array2.length-1-i] = temp;



        }






        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverse));

    }




}
