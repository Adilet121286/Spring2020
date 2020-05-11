package Repl_it_Practice_2;

public class Replit_AlterArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);

        //for(int e : a) {
          //  System.out.print(e + " ");
        //}

        // should print out 10 1 30 2 50
    }


    public static void mystery(int[] array) {
        int evenResult = 0;
        int oddResult = 0;

        for (int each: array){
            if (each%2 == 0){
                evenResult = each/2;
                System.out.print(evenResult+" ");
            }else if (each%2 != 0){
                oddResult = each*10;
                System.out.print(oddResult+" ");
            }
        }


    }
}
