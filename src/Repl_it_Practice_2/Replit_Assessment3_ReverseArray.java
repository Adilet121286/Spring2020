package Repl_it_Practice_2;

import java.util.Arrays;

public class Replit_Assessment3_ReverseArray {
    public static void main(String[] args) {
        String[] strings = {"apple", "pear","nuts"};
        System.out.println(Arrays.toString(reverse(strings)));

    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {

        String[] rev = new String[arr.length];
        int j = 0;
        for (int i=arr.length-1;i>=0;i--){
            rev[j] = arr[i];
            j++;

        }
        arr=rev;
        return arr;

    }
}
