package officeHours.practice_04_15_2020;

public class NestedLoops {
    public static void main(String[] args) {
        char[][] arr2D = { {'A','B'},{'C','D','E'},{'F','J','H'} };


        for (int j = 0; j<arr2D.length; j++ ) {

            for (int i = 0; i < arr2D[j].length; i++) {

                System.out.print(arr2D[j][i]+" ");

            }
        }
        System.out.println();

        System.out.println("================================================");

        for (char[] each: arr2D){
            for (char eachElement: each){
                System.out.print(eachElement+" ");


            }
        }


    }
}
