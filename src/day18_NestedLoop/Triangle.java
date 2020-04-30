package day18_NestedLoop;

public class Triangle {
    public static void main(String[] args) {

        /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * * * *
            * * * * * * *
         */

        int z=1;
        while (z<=7){

            int i = 1;
            while (i<=z) {

                System.out.print("* ");
                i++;

            }
            System.out.println();

            z++;
        }




    }
}
