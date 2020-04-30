package day05_UnaryShordthandopeators;

public class Leapyear {
    public static void main(String[] args) {
        short year = 2020;

        // Leap year: year % 4 == 0
            // if returns true ==> LeapYear, if it returns false ==> not LeapYear

        boolean leapYear = year % 4 == 0; // if the year can be devided by 4 without any reminder, then it's leap year

        System.out.println(year + "is leap year: " + leapYear);

    }
}
