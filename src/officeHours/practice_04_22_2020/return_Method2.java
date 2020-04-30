package officeHours.practice_04_22_2020;

import java.util.Arrays;

public class return_Method2 {

    public static void main(String[] args) {
        int[] ddd = {2,1,33,44,77,66};
        int n = aaa(ddd);
        System.out.println(n);

    }

    public static int aaa (int[] array) {
        Arrays.sort(array);

        return array[array.length-2];
    }

}
