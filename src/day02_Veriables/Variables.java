package day02_Veriables;

public class Variables {

    public static void main (String[]args){
        System.out.println("Length is: 10");
        System.out.println("Width is:  20");

        byte l=10;
        byte w=20;
        System.out.println(l);
        System.out.println(w);

        short s1 = 4000;

        int a = 100000;

        long b= 999999999999L;
        long c = 99999999999999999L;

        byte byteNum=100;
        short shortNum = byteNum;
        int intNum=shortNum;

        // GDP: 0.035

        double decimalNum=0.4;
        float decimalNum2=0.4f;

        System.out.println("=========================");

        int intNum2=100;
        float floatNum = intNum2; //100
        double doubleNumber = floatNum;

        System.out.println(intNum);
        System.out.println(floatNum); //100.0
        System.out.println(doubleNumber);


    }



}
