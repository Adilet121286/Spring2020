package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
            first method: sum of two int numbers
            second method: sum of three int numbers
            third method: sum of four int numbers

     */
    public static void main(String[] args) {
        // 10,5
        sum2Numbers(10,5);
        // 10,5,5
        sum3Numbers(10,5,5);
        // 10,20,30,40
        sum4Numbers(10,20,30,40);

        System.out.println("==================================================================================================================");

    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }



    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }



}
