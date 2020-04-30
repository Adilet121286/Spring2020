package Repl_it_Practice;


import java.util.Scanner;

/*
    -Declare int variables: seniorCitizens, nonSeniorCitizens, age
-Create a Scanner object
- Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
"Enter current count for seniorCitizens and nonSeniorCitizens:"

-Ask user to enter age:
"What is new citizen's age?"

-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

-At last, print another message:
"New seniorCitizens count ValueOfVariable"
"New nonSeniorCitizens count ValueOfVariable"

Example Run:

Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
 */
public class Repiit_033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");

        int seniorCitizens = scanner.nextInt();
        int nonSeniorCitizens = scanner.nextInt();

        System.out.println("What is new citizen's age?");

        int age = scanner.nextInt();
        String seniorCitizens1 = "Senior Citizen";
        String nonSeniorCitizens1 = "Non-Senior Citizen";
        String invalid = "input age invalid";


        String inputAge = (age >=65)? seniorCitizens1:(age<65 && age>0)?nonSeniorCitizens1:invalid;

        if (age >= 65){
            ++seniorCitizens;
        }else if(age < 65 && age > 0){
            ++nonSeniorCitizens;

        }else{
            System.out.println("Invalid");
        }

        System.out.println(inputAge);

        System.out.println("New seniorCitizens count "+ seniorCitizens);
        System.out.println("New nonSeniorCitizens count "+ nonSeniorCitizens);


    }
}
