package day05_UnaryShordthandopeators;

public class PostPre {

    public static void main(String[] args) {


        // pre: changes value of the variable immediately

        int a = 100;
        System.out.println(++a); //101
        System.out.println(a);

        int b=100;
        System.out.println(--b); //99
        System.out.println(b);

        // post:
        int A=100;
        System.out.println(A++); //100
        System.out.println(A); // 101

        int B = 100;
        System.out.println(B--); // 100
        System.out.println(B); // 99

        // post and pre examples

        int z=10;
        int x=++z; // at line 28, x is increased by 1
        System.out.println(x); // 11
        System.out.println(z); // 11

        int s = 10;
        int f = s++; // 10, after line 34, yhe value of s will be increased by 1
        System.out.println(f);
        System.out.println(s);


        double t1=3.5;
        double t2 = t1--; // 3.5, after 41 t1 will be decreased by 1

        System.out.println(t2);
        System.out.println(t1);


        int num = 35;
        System.out.println(num++); // 35, after line 48 the value of num will be 36
        System.out.println(num--); // 36, after line 49 the value of num will be 35

        int a4 = 50;
        a4 = --a4 + a4++ + a4-- + a4++;
        System.out.println(a4);


    }

}
