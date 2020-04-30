package Repl_it_Practice;

import java.util.Scanner;

public class Replit_073_Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        String lastName = "";
        String firstName = "";
        String domain = "";
        String topLevelDomain = "";
        String FirstLatterOfFirstname = "";
        String FirstLatterOfLastname = "";

        if (email.contains("_")){




            lastName = email.substring(email.indexOf("_")+2,email.indexOf("@"));
            firstName = email.substring(1,email.indexOf("_"));
            domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
            topLevelDomain = email.substring(email.indexOf(".")+1, email.length());


            FirstLatterOfFirstname = email.substring(0,1).toUpperCase();
            FirstLatterOfLastname = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase();


            System.out.println("First name: "+FirstLatterOfFirstname+firstName);
            System.out.println("Last name: "+FirstLatterOfLastname+lastName);
            System.out.println("Domain: "+domain);
            System.out.println("Top-Level Domain: "+topLevelDomain);





        }else {
            System.out.println(email);
        }





    }
}
