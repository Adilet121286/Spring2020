package day08_MultiBranchIfStatement;

/*

    1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal

 */

public class equalNumber {

    public static void main(String[] args) {

        double n1=100.5;
        double n2=100.5;
        double n3=300.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3; // if n1 equal n2 and dose not equal n3, that makes n1 equal n2 only
        boolean n1Equaln3 = n1 == n3 && n1 !=n2; // only n1 and n3 equal
        boolean n2Equaln3 = n2 == n3 && n3 !=n1; // only n1 and n3 equal


        boolean allEqual = n1 == n2 && n1 ==n3;

        boolean noneEqual = n1 != n2 && n1 !=n3 && n2 != n3;

        // boolean noneOfEqual = n1Equaln2 == false && n1Equaln3 == false && n2Equaln3 == false;

        // boolean none = !n1Equaln2 && !n1Equaln3 && !n2Equaln3;

        if (n1Equaln2){
            System.out.println(n1+" is equal to "+n2);
        }
        if (n1Equaln3){
            System.out.println(n1+" is equal to "+n3);
        }
        if (n2Equaln3){
            System.out.println(n2+" is equal to "+n3);
        }
        if (allEqual){
            System.out.println("all of them are equal");
        }
        if (noneEqual){
            System.out.println("None of them are equal");
        }



    }
}
