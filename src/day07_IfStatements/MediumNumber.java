package day07_IfStatements;

public class MediumNumber {

    public static void main(String[] args) {
        double a = 300.5;
        double b = 400;
        double c = 300;

        boolean aMedium= (a > b && a < c) || (a < b && a > c );
        boolean bMedium= (b > a && b < c) || (b < a && b > c );
        boolean cMedium= (c > a && c < b) || (c < a && c > b );

        if (aMedium){
            System.out.println(a+" is a medium number");
        }
        if (bMedium){
            System.out.println(b+" is a medium number");
        }
        if (cMedium){
            System.out.println(c+" is a medium number");
        }

    }
}
