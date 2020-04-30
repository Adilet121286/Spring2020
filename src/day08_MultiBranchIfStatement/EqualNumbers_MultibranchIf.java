package day08_MultiBranchIfStatement;

public class EqualNumbers_MultibranchIf {
    public static void main(String[] args) {

        double n1=100.5;
        double n2=100.5;
        double n3=300.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3; // if n1 equal n2 and dose not equal n3, that makes n1 equal n2 only
        boolean n1Equaln3 = n1 == n3 && n1 !=n2; // only n1 and n3 equal
        boolean n2Equaln3 = n2 == n3 && n3 !=n1; // only n1 and n3 equal

        boolean allEqual = n1 == n2 && n1 ==n3;

        // boolean noneEqual = n1 != n2 && n1 !=n3 && n2 != n3;

        if (n1Equaln2){
            System.out.println("n1 is equal to n2");
        }else if(n1Equaln3){
            System.out.println("n1 is equal to n3");
        }else if (n2Equaln3){
            System.out.println("n2 is equal to n3");
        }else{
            System.out.println("None of them are equal");
        }




    }
}
