package Repl_it_Practice_2;

import java.util.ArrayList;

public class Replit_DeliveryCalc {
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel)
    {
        Integer sum = 0;

        for (int i=0;i<deliveries.size();i++){
            sum +=deliveries.get(i);
        }

        if (sum%max_fuel !=0){
            return sum/max_fuel + 1;
        }else {
            return sum/max_fuel;
        }



    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}
