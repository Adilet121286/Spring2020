package day05_UnaryShordthandopeators;

public class PrimitiveCastings {

    public static void main(String[] args) {

        int a = 10;
        long b = a; // implicit casting is done automaticlly
            // b = 10L;

        // int c = b; // b is still long datatype;

        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit casting

        // int c1 = b1;

        // Explicit casting:

        int Inum = 100;
        byte Bnum = (byte) Inum;

        short Snum = (byte)Inum;

        double Dnum = 5.5;
        float Fnum = (float)Dnum;
        float Fnum1 = (int)Dnum; // Fnum1 = (int)5.5 ==> Fnum1 == 5 ==>5.0;


        System.out.println(Fnum);
        System.out.println(Fnum1);

        float F1 = 60.5F;
        int I1 = (int) F1;
        System.out.println(I1);

        long largeNum = 999999999999999999L;
        int intNum = (int) largeNum;
        System.out.println(intNum);
                // it gives different number because 999999999999 is out of int range

        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2 = 23456;
        System.out.println(ch2);

        double dbl1 = ch2; // 23456.0
        System.out.println(dbl1);

    }

}
