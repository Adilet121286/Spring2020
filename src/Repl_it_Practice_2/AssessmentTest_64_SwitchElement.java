package Repl_it_Practice_2;

import day11_Scanner.ScannerClass;

import java.util.Arrays;
import java.util.Scanner;

public class AssessmentTest_64_SwitchElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i=0; i<array.length; i++){

            array[i] =scanner.nextInt();
        }


        int[] result = do_switch(array);
        System.out.println(Arrays.toString(result));

    }


    public static int[] do_switch(int[] i) {


        int[] arr = new int[i.length];

        arr[0] = i[i.length-1];
        arr[arr.length-1] = i[0];

        for (int k=1; k < arr.length-1; k++ ){

            arr[k] = i[k];

        }


        return arr;


    }
}
