package Repl_it_Practice;

import java.util.Scanner;

public class Replit_078_CarInsurance {
    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");


        //WRITE YOUR CODE HERE


        String license;
        int zipCode = 0;
        int age = 0;
        int drivingExperiance;
        String yesNoAccident;


        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        license = scan.next();
        if (license.equalsIgnoreCase("Yes")){

            System.out.println("Enter your zip code");
            zipCode = scan.nextInt();

            if (zipCode == 20910 || zipCode == 20740){
                premium += 60;
            }else if (zipCode == 22102 || zipCode == 22103){
                premium += 30;
            }else {
                premium +=50;
            }




            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership = scan.next();

            if (vehicleOwnership.equalsIgnoreCase("Owned")){
                premium +=10;
            }else {
                premium +=20;
            }





            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.next();

            if (vehicleUsage.equalsIgnoreCase("Business")){
                premium +=50;
            }else if (vehicleUsage.equalsIgnoreCase("Pleasure")){
                premium +=10;
            }else if (vehicleUsage.equalsIgnoreCase("Commute ")){
                premium +=20;
            }





            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();

            if (daysDrivenToWorkOrSchool > 0) {

                premium += (daysDrivenToWorkOrSchool * 5.0);
            }





            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();

            if (milesToWorkOrSchool > 0) {

                premium += milesToWorkOrSchool;
            }






            System.out.println("How old are you?");
            age = scan.nextInt();
            if (age < 16){
                System.out.println("Invalid data!");
                System.exit(0);
            }else if(age >= 16 && age <18){

                premium *= 20;
            }else if (age >=18 && age <=21){

                premium *= 6;
            }else if (age >21 || age <25){
                premium *=2;
            }





            System.out.println("How many years you've been driving?");
            drivingExperiance = scan.nextInt();

            if (drivingExperiance >0 && age >=16){

                premium -= (drivingExperiance * 5);

            }else {
                System.out.println("Invalid data!");
                System.exit(0);
            }





            System.out.println("Have you had any accidents in the last 5 years?");
            yesNoAccident = scan.next();

            if (yesNoAccident.equalsIgnoreCase("Yes")){

                System.out.println("How many?");
                accidentsAmount = scan.nextInt();
                if (accidentsAmount > 0){
                    premium += ((premium * 0.2)*accidentsAmount);
                }

            }






            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.next();
            if (continuousInsurance.equalsIgnoreCase("No")){
                premium *= 2;
            }




            System.out.println("What is the highest level of education you have completed?");
            education = scan.next();
            if (education.equalsIgnoreCase("PhD")
                    || education.equalsIgnoreCase("Bachelors")
                    || education.equalsIgnoreCase("Masters")){

                premium -= (premium * 0.05);

            }else if (education.equalsIgnoreCase("Doctors")){
                premium -= (premium * 0.1);
            }else {
                premium += (premium * 0.05);
            }







        }else {
            System.out.println("Invalid data!");
            System.exit(0);
        }




        String FirstTwoLettersOfName = name.substring(0,1).concat(name.substring(1,2));
        int nameLastIndex = name.length()-1;
        String LastTwoLettersOfName = name.substring(nameLastIndex-1,nameLastIndex+1);

        referenceNumber += (FirstTwoLettersOfName+age+LastTwoLettersOfName+zipCode+education).toUpperCase();

        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        System.out.println("Reference number: "+referenceNumber);




    }

}
