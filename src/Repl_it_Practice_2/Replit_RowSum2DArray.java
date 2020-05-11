package Repl_it_Practice_2;

public class Replit_RowSum2DArray {

    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };


        int[] sums = rowSums(a);
        for(int sum : sums)
            System.out.print(sum);
        //this should print 4 6 11 3

    }
    public static int[] rowSums(int[][] nums) {

        int[] result = new int[nums.length];


        for(int k=0;k<nums.length;k++){
            int sumOf = 0;

            for (int i=0;i<nums[k].length;i++){
                sumOf +=nums[k][i];


            }
            result[k] = sumOf;

        }

        return result;



    }

}
