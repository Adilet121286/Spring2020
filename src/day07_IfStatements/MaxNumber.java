package day07_IfStatements;

/*

    2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */

public class MaxNumber {

    public static void main(String[] args) {
        double a = 1000;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b && a > c;
        boolean bGreater = a < b && b > c;
        boolean cGreater = c > b && c > a;

        if(aGreater){
            System.out.println(a+" is the greatest");
        }
        if(bGreater){
            System.out.println(b+" is the greatest");
        }
        if(cGreater){
            System.out.println(c+" is the greatest");
        }

    }
}
