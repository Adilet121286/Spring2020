package Repl_it_Practice;

public class Replit_164_SimpleRoomBook {

    public static void main(String[] args) {

        boolean b = true;
        int month = 2;
        int day = 5;
        int year = 2017;

        boolean reserved = simpleRoomBook(b,month,day,year);
        System.out.println(reserved);



    }



    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){


        boolean result = true;
        if (isAvailable==true){
            if (month==7 && day >= 1 && day <=8 && year == 2018){
                result = false;
            }else if(month<=0 || day<=0 || year<2018){
                result = false;
            }else {
                result = true;
            }

        }else{
            result = false;
        }
        return  result;



    }
}
