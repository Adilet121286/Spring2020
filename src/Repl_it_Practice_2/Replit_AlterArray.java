package Repl_it_Practice_2;

public class Replit_AlterArray {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5};
        mystery(a);

        for(int e : a) {
            System.out.print(e + " ");
        }

        // should print out 10 1 30 2 50
    }


    public static void mystery(int[] array) {



        for (int i=0; i<array.length; i++){
            array[i]=(array[i]%2==0) ? array[i]/2 : array[i]*10;
        }


    }
}
