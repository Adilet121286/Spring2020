package officeHours.practice_03_18_2020;

public class UnaryOperators_Practice {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(a++);
        System.out.println(a);

        int b = 30;
        int c = b--; // c = 30, b = 29;
        System.out.println(b); // 29
        System.out.println(c); // 30

        int d = 40;
        int e = d++;
        System.out.println(d);
        System.out.println(e);



        int z = 100;
        z = z++ + --z - z-- + ++z;
          //  100+100-100+100

        System.out.println(z);

        int u = 900;
        int r = - ++u + ++u + -u++;
        //      -901 + 902 + -902


    }

}
