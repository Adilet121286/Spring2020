package day03_VariablesContinue;

public class char_boolean {

    public static void main(String[] args) {

        System.out.println('z' == 100);     // false
                           // 122 == 100 ==> false



        System.out.println('z' == 122);     // true

                        // 122 ==122 ==> true

        System.out.println('a' == 'A');     // false

        System.out.println('a' > 'b');      // false
                           // 97 > 98 ==> false

        System.out.println('a' != 98 - 1);  // false
                          // 97 != 97 ==> false

        // System.out.println('a' == "a");

        boolean r1 = 'a' >50;       // true

        boolean r2 = 'b' == 'a'+1;  // true
        System.out.println(r2);


    }

}
