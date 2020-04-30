package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");  //0
        list.add("B"); //1
        list.add("C");  //2


        // list.remove(1);


        boolean r1 =  list.remove("F"); // false

        boolean r2 = list.remove("A"); // true

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);


        list.clear(); // []

        System.out.println(list);
        System.out.println(list.size());


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  // 0
        list2.add(1);  // 1
        list2.add(2);  // 2
        list2.add(3);  // 2

        //{1,1,2,3}

        int num1 = list2.indexOf(1); //0
        // Integer = int  // AUtoboxing

        System.out.println(num1);

        int num2 =  list2.indexOf(100);
        System.out.println(num2);

        int num3 = list2.indexOf(3);  //3
        System.out.println(num3);





    }
}
