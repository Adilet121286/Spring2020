package day04_JavaRecap;

public class veriables_practice {

    public static void main(String[] args) {

        // DataType variableName = Data

        // double > float > long > int > short > byte

        byte num1 = 100;
        short s1 = num1;

        // byte num2 = s1;

        // short s2 = 40000;

        int num2 = s1;

        // int public = 1000;

        long l1 = 99999999999L;

        float f1 = 999999F;
        System.out.println(f1);

        double d1 = 15.1;

        double d2 = 10; // 10.0

        double d3 = 100L; // 100.0

        char ch1 = 'A';
        char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 9890;
        System.out.println(ch3);

        int a1 = 'k';
        System.out.println(a1);

        int a2 = 'a' + 'b';
        // 97+98=195

        System.out.println(a2);

        double dnum = 'a';
        System.out.println(dnum);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(10>5+5);

        boolean result1 = 10>9;

        System.out.println(10!=10);

        System.out.println("Corona" == "Ebola"); // false

        System.out.println("Corona" != "Ebola"); // true

        System.out.println('a' != 97);
                        // 97 != 97 ==> false

        System.out.println( !true); // false

        System.out.println(!false); // true

        boolean r1 = true != !false; // false

        boolean r2 = !(9 >10) != !(10 > 9); //true

        System.out.println(r2); //

        boolean r3 = !!!true;
        System.out.println(r3);






    }

}
