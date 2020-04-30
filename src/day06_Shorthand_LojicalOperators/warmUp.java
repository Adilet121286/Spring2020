package day06_Shorthand_LojicalOperators;

public class warmUp {
    public static void main(String[] args) {

        double numberOfGallons = 5;
        double gallonstoLittre = numberOfGallons*3.785;
        String result = numberOfGallons + " gallons is equal to: " + gallonstoLittre + " litters";
        System.out.println(result);

        System.out.println("===========================================");

        double numberOfLitters = 1;
        double littersToGallons = numberOfLitters/3.785;
        String result1 = numberOfLitters + " litters is equal to: " + littersToGallons + " gallons";
        System.out.println(result1);

        System.out.println("===============================================");


        int a =200; // 199
        int b = -a++ + - --a * a-- %2;
        //  b= -200 + -200 * 200 % 2
        // b= -200 + - 40000 %2
        // b= -200 + 0
        //b= -200;

        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x   +  y    - x  *  y + x / y;
        //  z=  300 + 400 - 300  * 400 + 300/400;
        //  z = 300+ 400 - 120 000+0,75  ===>  int 0,75 is 0;
        //  z = 700 - 120 000
        System.out.println(z);


    }

}

/*

warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

 */