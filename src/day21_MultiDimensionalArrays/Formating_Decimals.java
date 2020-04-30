package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class Formating_Decimals {
    public static void main(String[] args) {
        DecimalFormat  DF = new DecimalFormat("0.00");  // rounding the decimals

        double a = 10.0/3.0;

        System.out.println(a);

        System.out.println( DF.format(a)  );

        System.out.println(2.3467899);

        System.out.println( DF.format(2.346789));



    }

}
