package day08_MultiBranchIfStatement;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println("it is bigening ");
        waits(4);
        System.out.println("time is up");

    }


    public static void waits(double seconds){
        try {
            Thread.sleep((long)(seconds * 1000) );
        }catch (Exception e){ }

    }

}
