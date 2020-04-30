package day23_Methods;

/*
 1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */

public class UniqeValues {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D"};  // B
                //       0    1    2

        for(int j=0; j < arr.length; j++){ // 3:  A  B A

            int count2 = 0;
            for(int i =0; i < arr.length; i++ ){
                if( arr[i].equals(arr[j]) ){
                    count2++;
                }
            }

            if(count2 == 1){
                System.out.println(arr[j]);
            }

        }




        System.out.println("=============================================");

        // solution2:
        for( String each2 : arr ){ // 3: A,

            int count = 0;
            for( String each : arr ){
                if(each.equals(each2)){
                    count++;
                }
            }

            if(count == 1){  // if the character is unique
                System.out.println(each2);
            }


        }













    }
}
