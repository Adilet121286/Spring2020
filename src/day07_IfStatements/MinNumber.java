package day07_IfStatements;
/*

    3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)

 */

public class MinNumber {
    public static void main(String[] args) {
        double num1 = 100;
        double num2 = 200;
        double num3 = 300;

        boolean num1M = num1 < num2 && num1 < num3;
        boolean num2M = num2 < num1 && num2 < num3;
        boolean num3M = num3 < num2 && num3 < num1;

        if(num1M){
            System.out.println(num1 + " is a minimum number");
        }
        if(num2M){
            System.out.println(num2 + " is a minimum number");
        }
        if(num3M){
            System.out.println(num3 + " is a minimum number");
        }


    }
}
