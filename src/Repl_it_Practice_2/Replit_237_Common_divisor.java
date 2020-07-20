package Repl_it_Practice_2;

public class Replit_237_Common_divisor {
    public static void main(String[] args) {
        System.out.println(commonDivisor(15, 25)); //5
        System.out.println(commonDivisor(40, 124)); //4
        System.out.println(commonDivisor(120, 60)); //60
        System.out.println(commonDivisor(80, 60)); //20
    }


    public static int commonDivisor(int m, int n){
        //WRITE YOUR CODE HERE

        while (m != n) {  // 15 != 25
            if(m > n) {
                m = m - n;  //   (second step)  m 15-10 ==> 5
            }else {
                n = n - m;  // n = 25-15 ==>10
            }
        }

        return n;
    }
}
