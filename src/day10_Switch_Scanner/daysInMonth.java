package day10_Switch_Scanner;

public class daysInMonth {

    public static void main(String[] args) {

        int num = 12;

        boolean days28 = num ==2;
        boolean days30 = num ==4 || num ==6 || num == 9 || num == 11;
        String result = "";

        if (num>0 && num <13){
            result = (days28) ? "Month has 28 days":(days30) ? "Month has 30 days" : "Month has 31 days";

        }else{
            result = "invalid";
        }

        System.out.println(result);

    }
}
