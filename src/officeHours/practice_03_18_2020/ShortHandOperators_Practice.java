package officeHours.practice_03_18_2020;

public class ShortHandOperators_Practice {

    public static void main(String[] args) {
        // +=: addition asssignment

        int a = 100;
        //  a = a + 200;
        a += 200; // a= 300

        System.out.println(a);

        a += 200 * 3;  // a = 900
        System.out.println(a);

        // -=: subtraction assignment
        //    a = a - 400;
        a -= 400;  //a =500

        System.out.println(a);

        int b = 300;
        b  -=  3 * 40;
        // b -= 120; ==> 180
        System.out.println(b);

        // *=: multiplication assignment
        int x = 5;

        //  x = x * 3; // 15
        x *= 3;  // ==> 15

        System.out.println(x);

        x *= 2+1;
        // x *= 3;  x = x * 3 ==> 45

        System.out.println(x);


        //  /=: division assignment:

        int n = 900;

        // n = n / 3;

        n /= 3; // 300

        System.out.println(n);

        n /= 3 *5; // n = n / 15  ==> 20

        System.out.println(n);

        // remainder: nomurator - (denominator * Whole Number for result )
                  //      10          (3 * 3.33333333) ; // 10/3 = 3.3333333 ==> 3

        int m = 10;
        m = m % 3; // 1
        System.out.println(m);


        int y = 300;
        y %=3*5;
        System.out.println(y);

        int t = 400;
        t = 10%2;
        //t %= 20 ==> t = t % 20;



    }

}
