package day09_NestedIf_Ternary;
 /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */

public class ageGroup_NastedIf {
    public static void main(String[] args) {

        int age= 149;
        String X = "";

        if(age<150 && age>0){
            X = (age<=20) ? "Teenager"
                    : (age >=21 && age <=55) ? "Adult"
                    :  "Senior";


        }else{
            X = "You are not a human";
        }

        System.out.println(X);


    }
}
