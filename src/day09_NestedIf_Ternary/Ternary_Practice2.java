package day09_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println("The minimum number is: "+min);
        System.out.println("========================================");

        int hours = 14;
        String srt1 = (hours < 12) ? "Good morning" : (hours > 12 && hours < 18) ? "Good afternoon"
                : "Good evening";
        System.out.println(srt1);
        System.out.println("==========================================");

        int number = 12000;
        boolean divisibleBy3And5 = (number % 3 == 0 && number % 5 == 0) ? true : false;
        System.out.println(divisibleBy3And5);

    }

}
