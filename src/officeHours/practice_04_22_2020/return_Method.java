package officeHours.practice_04_22_2020;

import javax.sql.rowset.spi.SyncResolver;

public class return_Method {
    public static void main(String[] args) {

        int sum = sum(10,20);
        System.out.println(sum);
        void_Method.line();

        int sum1 = sum(10,38,56);
        System.out.println(sum1);
        void_Method.line();

        String rev = ReverseString("Adilet is the best");
        System.out.println(rev);



    }



    public static int sum (int a, int b){
        return (a+b);
    }

    public static int sum (int a, int b, int c){
        return (a+b+c);
    }

    public static int sum (int a, int b, int c,int d){
        return (a+b+c+d);
    }

    public static String ReverseString(String string){

        String reversed ="";
        for (int i = string.length()-1; i>=0; i--){
            reversed +=string.charAt(i);
        }
        return reversed;


    }


}
