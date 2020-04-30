package Repl_it_Practice;

import java.util.Scanner;

public class Replit_051_TipCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tipType;
        int numPeople;
        double checkAmount;
        int NoNumPeople;
        double NoCheckAmount;
        String serviceQuality;


        System.out.println("Split:");
        String yesNo = scanner.next();




        if(yesNo.equalsIgnoreCase("Yes")){

            String numPeopelSt = "";

            System.out.println("Number of people:");
            numPeople = scanner.nextInt();

            for (int i=0; i < numPeople; i++) {
                numPeopelSt += '&';
            }


             System.out.println("Check amount:");
             checkAmount = scanner.nextDouble();

             System.out.println("Service Quality:");
             serviceQuality = scanner.next();



            if (serviceQuality.equalsIgnoreCase("Poor")){
                tipType = 0.05;
                System.out.println("Number of people entered: "+numPeopelSt);
                System.out.println("Total to pay: "+(checkAmount+(checkAmount * tipType)));
                System.out.println("Total tip: "+(checkAmount * tipType));
                System.out.println("Total per person: " + (checkAmount+(checkAmount * tipType)) / numPeople);
                System.out.println("Tip per person: "+ ((checkAmount * tipType) / numPeople));

            }else if (serviceQuality.equalsIgnoreCase("Fair")){

                tipType = 0.1;
                System.out.println("Number of people entered: "+numPeopelSt);
                System.out.println("Total to pay: "+(checkAmount+(checkAmount * tipType)));
                System.out.println("Total tip: "+(checkAmount * tipType));
                System.out.println("Total per person: " + (checkAmount+(checkAmount * tipType)) / numPeople);
                System.out.println("Tip per person: "+ ((checkAmount * tipType) / numPeople));

            }else if (serviceQuality.equalsIgnoreCase("Good")){

                tipType = 0.15;
                System.out.println("Number of people entered: "+numPeopelSt);
                System.out.println("Total to pay: "+(checkAmount+(checkAmount * tipType)));
                System.out.println("Total tip: "+(checkAmount * tipType));
                System.out.println("Total per person: " + (checkAmount+(checkAmount * tipType)) / numPeople);
                System.out.println("Tip per person: "+ ((checkAmount * tipType) / numPeople));

            }else if (serviceQuality.equalsIgnoreCase("Great")){

                tipType = 0.20;
                System.out.println("Number of people entered: "+numPeopelSt);
                System.out.println("Total to pay: "+(checkAmount+(checkAmount * tipType)));
                System.out.println("Total tip: "+(checkAmount * tipType));
                System.out.println("Total per person: " + (checkAmount+(checkAmount * tipType)) / numPeople);
                System.out.println("Tip per person: "+ ((checkAmount * tipType) / numPeople));

            }else if (serviceQuality.equalsIgnoreCase("Excellent")){

                tipType = 0.25;
                System.out.println("Number of people entered: "+numPeopelSt);
                System.out.println("Total to pay: "+(checkAmount+(checkAmount * tipType)));
                System.out.println("Total tip: "+(checkAmount * tipType));
                System.out.println("Total per person: " + (checkAmount+(checkAmount * tipType)) / numPeople);
                System.out.println("Tip per person: "+ ((checkAmount * tipType) / numPeople));

            }


        }else if (yesNo.equalsIgnoreCase("No")){

            String NonumPeopelSt = "";

            System.out.println("Number of people:");
            NoNumPeople = scanner.nextInt();

            for (int i=0; i < NoNumPeople; i++) {
                NonumPeopelSt += '&';
            }


            System.out.println("Check amount:");
            NoCheckAmount = scanner.nextDouble();


            System.out.println("Number of people entered: "+NonumPeopelSt);
            System.out.println("Total to pay: "+NoCheckAmount);
            System.out.println("Total tip: "+0);
            System.out.println("Total per person: " + (NoCheckAmount/NoNumPeople));
            System.out.println("Tip per person: "+ 0);

        }else {
            System.out.println("Invalid enter");
        }





    }
}
