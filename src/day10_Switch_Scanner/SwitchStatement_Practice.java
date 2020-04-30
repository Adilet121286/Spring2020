package day10_Switch_Scanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {

        byte number = 5;
        String str1 = "";

        switch (number){
            case 1:
                str1 = "Monday";
                break; // case closed
            case 2:
                str1 = "Tuesday";
                break;
            case 3:
                str1 = "Wednesday";
                break;
            case 4:
                str1 = "Thursday";
                break;
            case 5:
                str1 = "Friday";
                break;
            case 6:
                str1 = "Saturday";
                break;
            case 7:
                str1 = "Sunday";
                break;

                default:
                 str1 = "Invalid";
                 break;


        }

        System.out.println(str1);

    }

}
