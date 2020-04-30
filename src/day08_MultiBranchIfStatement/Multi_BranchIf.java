package day08_MultiBranchIfStatement;

public class Multi_BranchIf {

    public static void main(String[] args) {

        int a = 100;

        boolean zero = a == 0;
        boolean negative = a <0;
        boolean positivw = a > 0;

        if(a == 0){
            System.out.println("Zero");
        }else if(a > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }



    }
}
