package day20_ArrayContiniue;

/*
    1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
 */
public class Max_Min {

    public static void main(String[] args) {
        int[] arr ={10, 6, 3, 1, 200, 1000};
        int lastindex = arr.length - 1;
        int max = arr[0]; // 10
        int min = arr[0];

        for(int i = 0; i <= lastindex; i++  ){


            if(arr[i] >= max){  // array's index are compared with each other, and whichever is greater will be assigned to the max
                max = arr[i];
            }

            if(arr[i] < min){ // array's index are compared with each other, and whichever is smaller will be assigned to the min
                min = arr[i];
            }

        }


        System.out.println(max);
        System.out.println(min);





    }
}
