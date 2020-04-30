package day06_Shorthand_LojicalOperators;

public class shhortHandOperators {

    public static void main(String[] args) {

        int x = 20;
        x+=10; // x = x + 10 = 30;

        System.out.println(x);

        String schoolName = "Cybertek";
        schoolName+=12345;
        System.out.println(schoolName);

        System.out.println('a'+'b');
        //                  97+98==>195;

        char ch1 = 'a';
                ch1+='b';
        System.out.println(ch1); // returnes character

        int num = 'z';
            num +='x';
        System.out.println(num);

        int a1=100;
        int b1= (a1*=2) + ++a1;
        // b1 = 200 + 201

        System.out.println(b1);

        int x1 = 10;
        int y = x1 +=10*2;  // x1 = x1 +20;
                // x1 += 20; ==>30;
        System.out.println(y);

        int q=20;
        int p=q*=20*3;
            // p = q *= 60;   // q = 20 * 60 = 1200;

        int num1 = 300;
        num1 /= 2; // num1 = num1 / 2 ==>150

        int num2 = 400;
        num2 /= 20+10; // num2 = num2 / 30
                        // num2 = 400/ 30
                        // num2 = 13
        int num3 = 300;
        num3 %= 10+20; // 300%30==>0

        System.out.println(num3);



    }

}
