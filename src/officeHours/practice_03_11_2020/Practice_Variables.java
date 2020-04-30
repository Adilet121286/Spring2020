package officeHours.practice_03_11_2020;

public class Practice_Variables {
    /* Car:
        brand
        year
        price
        model
        maximum miles
    */

    public static void main(String[] args) {
        String brand = "BMW";
        short year = 2020;
        float price = 50000.50F;
        String model = "X6";
        short maxMiles = 32767;


         System.out.println(brand);
                // variables that are decleared in a blpck, must be initialized before use

       /*
        System.out.println(9 + 10); // 19, addition
        System.out.println("9" + "10"); // 910 concatenation
        System.out.println("9" + 10);   // 910 concatenation
        */

        System.out.println("The vehicle: "+year+" "+brand+" "+model+"has "+maxMiles+" miles, "+"price is "
                            +price+" dollars");

    }
}
