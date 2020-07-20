package Repl_it_Practice_3;

public class BadProducts {
    public static boolean badP(int[] products,int limit) {


        int broken = 0;
        for (int each: products){
            if (each==0){
                broken++;
            }
        }
        if (broken<limit){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,0};
        int d = 2;
        badP(arr,5);
        System.out.println(badP(arr,d));





    }
}
