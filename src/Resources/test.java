package Resources;

import day33_CustomClass.Car;

import javax.sound.midi.Soundbank;

public class test {
    byte b;
    short sh;
    int i;
    long l;
    float f;
    double d;
    boolean bo;
    char ch;

    static String str = "Muhtar and Rahman";

    static String str2 = new String("Muhtar and Rahman");



    public static void main(String[] args) {

        System.out.println(str);
        System.out.println("===============");

        System.out.println(str2);
        System.out.println("===============");

        System.out.println(str == str2);
        System.out.println("===============");

        System.out.println(str.equals(str2));


    }


}
