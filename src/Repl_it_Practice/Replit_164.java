package Repl_it_Practice;

public class Replit_164 {
    public static void main(String[] args) {
        System.out.println(simpleRoomBook(true, 7, 10, 2020));
    }
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year){
        boolean result = true;
        result = (isAvailable == true && year == 2018 && !(month == 7 && day >= 1 && day <=8))? true : false;
        return result;
    }

}
