package Repl_it_Practice;

public class Replit_113_PrintEvevFrom80to20 {
    public static void main(String[] args) {

        int[] numbers = new int[61];
        int count = 80;
        for (int eachElement: numbers){
            eachElement = count;
            count--;
            if (eachElement % 2 == 0) {
                System.out.print(eachElement + " ");
            }

        }

    }
}
