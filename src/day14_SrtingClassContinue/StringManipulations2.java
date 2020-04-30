package day14_SrtingClassContinue;

public class StringManipulations2 {

    public static void main(String[] args) {

        String str = " ";

        boolean b1 = str.isEmpty();
        System.out.println(b1);

        String userName = "";

        if(userName.isEmpty()){
            System.out.println("Please, provide the username");
        }

        String s1 = "Cat";      // String literal
        String s2 = new String("Cat");

        System.out.println(s1 == s2);       // false, different memory locations, different objects

        System.out.println( s1.equals(s2));     // true



        String z1 = "Tiger";

        String z2 = new String("Tiger");

        String z3 = "Tiger";

        String z4 = "Lion";

        // ==

        System.out.println(z1 ==z2);        // false
        System.out.println(z2 == z3);       // false
        System.out.println(z1 == z3);       // true; same objects

        // equals();

        System.out.println(z1.equals(z2));      // true
        System.out.println(z2.equals(z3));      // true
        System.out.println(z1.equals(z3));      // true  the same name
        System.out.println(z1.equals(z3));      // false; different text

        /*

            userName: cybertek
            passWord: cybertekshool

         */



    }
}
