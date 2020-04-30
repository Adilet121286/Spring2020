package day08_MultiBranchIfStatement;

public class DaysMonth {
    public static void main(String[] args) {

        byte month = 11;
        String result = " ";

        if (month ==1){
            result = "January has 31 days";
        }else if(month == 2){
            result = "February has 28 or 29 days";
        }else if (month ==3){
            result = "March has 31 days";
        }else if (month ==4){
        result = "April has 30 days";
        }else if (month ==5){
            result = "May has 31 days";
        }else if (month ==6){
            result = "June has 30 days";
        }else if (month ==7) {
            result = "July has 31 days";
        }else if (month ==8) {
            result = "August has 31 days";
        }else if (month ==9) {
            result = "September has 30 days";
        }else if (month ==10) {
            result = "October has 31 days";
        }else if (month ==11) {
            result = "November has 30 days";
        }else if (month ==12) {
            result = "December has 31 days";
        }else{
            result = "Invalid entry";
        }

        System.out.println(result);




    }
}
