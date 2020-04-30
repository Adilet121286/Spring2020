package Repl_it_Practice;

import java.util.Scanner;

public class Replit_141_FindCube {

    public static void cube()
    {
        //your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num*num*num;

        System.out.println(result);


    }//end cube

    public static void main(String[] args) {

        cube();

    }
}
