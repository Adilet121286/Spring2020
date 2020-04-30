package day13_StringClass;

import java.util.Scanner;

public class StringManipulation_Practice {
    public static void main(String[] args) {

        /*
            input: cyBerTek sCHooL

            output:
                Cybertek
                School
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter your full name:");
        String fullName = input.nextLine();     // cybertek school

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();



        System.out.println("your first name is: "+firstName);
        System.out.println("your last name is: "+lastName);


        /*

             /*
        Assignment:
            write me a programk that asks the user fiurt and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */






    }
}
