package officeHours.SaimDay5;

import java.util.Arrays;

public class CountUpperAndLower {
   /*
    7) Create a method that will accept a String of
    multiple words separated by a space and return a 2D array.
    Each array in the multidimensional array will have two elements:
    the number of uppercase letters and the number of lowercase letters
     */

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(countAll("The hOusE IS biG how mAnY words")));
    }

    public static int [][] countAll(String str) {

        String [] words = str.split(" ");
        int [][] count = new int[words.length][2];
        int index = 0;//1

        for(String eachElement :words) {  // "The" "hOusE"

            int upper = 0;//1+1
            int lower = 0;//1+1+1

            for(int i=0; i < eachElement.length(); i++) {

                if(Character.isUpperCase(eachElement.charAt(i))){
                    upper++;
                } else if(Character.isLowerCase(eachElement.charAt(i))){
                    lower++;
                }

            }

            int [] each = {upper, lower};
            count[index] = each;
            index++;
        }
        return count;
    }


}
