package Repl_it_Practice;

import java.util.Scanner;

public class Replit_145_PlusMinus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arrays){

        int possitive = 0;
        int negative = 0;
        int zero = 0;

        for (int i=0; i<arrays.length; i++){
            if (arrays[i]>0){
                possitive++;
            }else if (arrays[i]<0){
                negative++;
            }else if (arrays[i] == 0){
                zero++;
            }


        }
        System.out.println("positives:"+possitive+", negatives:"+negative+", zeros:"+zero);

    }

}
