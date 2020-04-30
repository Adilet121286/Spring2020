package Repl_it_Practice;

import java.util.Scanner;

public class Replit_095_GetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";
        int countBread = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i).startsWith("bread"))
                countBread++;
        }
        if (countBread <= 1) {
            System.out.println("nothing");
            System.exit(0);
        }
        result = str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
        System.out.println(result);

    }
}
