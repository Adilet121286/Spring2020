package Repl_it_Practice;

public class Replit_161_WaterTax {
    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        if (units<=50 && units>0){
            bill = units * 0.60;
        }else if (units > 50 && units <=100){
            bill = units * 0.90;
        }else if (units >100 && units<=150){
            bill = units * 0.90 + 50;
        }else if (units > 150){
            bill = units * 0.90 + 100;
        }




        //end your code here


        return bill;
    }//end waterTax

    public static void main(String[] args) {

        double bill2 = waterTax(151);
        System.out.println(bill2);

    }

}
