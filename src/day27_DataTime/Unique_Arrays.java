package day27_DataTime;

/*
    3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
 */

public class Unique_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,6};


        for (int each2 : arr){

            int count = 0;
            for (int each : arr){
                if (each == each2){
                    count++;
                }

            }

            if (count==1){
                System.out.println(each2);

            }


        }
        System.out.println("==========================================");

        int[] arr2 = {55,55,55,3,22,22,4,4,5,6,6,7,8,5,2};
        Unique(arr2);
        System.out.println("==========================================");

        double[] arr3 = {0.1, 0.1,0.1};
        Unique(arr3);

    }

    public static void Unique (int[] array){
        for (int each2 : array){

            int count = 0;
            for (int each : array){
                if (each == each2){
                    count++;
                }

            }

            if (count==1){
                System.out.println(each2);

            }


        }
    }


    public static void Unique (double[] array){
        for (double each2 : array) {

            int count = 0;
            for (double each : array) {
                if (each == each2) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(each2);

            }
        }


        }
}
