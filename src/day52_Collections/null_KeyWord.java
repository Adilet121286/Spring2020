package day52_Collections;

import java.util.ArrayList;

public class null_KeyWord {

    static String str = new String("Cybertek");
    // == null
    //static ArrayList<Integer> list1 ;

    public static void main(String[] args) {

        System.out.println(str.charAt(0));
        //   System.out.println(list1.get(1));

        // WebElement element = null;
        String str2 = null;
        Integer i1 = null;
        //  int num = null;

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(null);

        System.out.println(list1);
        System.out.println("==============================");
        String number = "123";

        int num1 = Integer.parseInt(number);

        System.out.println(num1);

        System.out.println("===============================");
        String[] arr = {null, "Cybertek", "ABC"};
        arr[2].toUpperCase();

        String name1 = "cybertek".toUpperCase();
        name1 = null;
        // name1 =  name1.toLowerCase();

        System.out.println(name1);

    }
}