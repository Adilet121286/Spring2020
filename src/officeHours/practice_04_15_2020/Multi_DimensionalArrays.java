package officeHours.practice_04_15_2020;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int[] arr1D = { 1,2,3  };
        //                 0 1 2      0 1 2 3
        int[][] arr2D = { {1,2,3 } , {4,5,6,7}  };
        //                       0           1
        //[index num of 1DArray][index num of elements]


        // {4,5,6,7};

        System.out.println( arr2D[1] );
        System.out.println(Arrays.toString(arr2D[1]) );


        // 7
        System.out.println( arr2D[1][3]  );

        // 4
        System.out.println( arr2D[1][0]  );



    }


}
