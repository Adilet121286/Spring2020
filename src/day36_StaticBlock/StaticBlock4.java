package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {
    static String name = "Cybertek School";
    static Tester tester1 = new Tester();
    //tester1.setInfo("Muhtar", 123, "SDET", 120000);

    int insVariable;

    static{ //  designed for statics only

        // gets executed as soon as the class is loaded  Done
        // designed to initialize static variables

        name = "Cybertek School";
        tester1.setTesterInfo("Muhtar", 123, "SDET", 120000);
        tester1.setTesterInfo("Namik", 1245, "SDET", 120000);

        // StaticBlock4 obj1 = new StaticBlock4();
        //        obj1.insVariable = 300;  // DO NOT use static block for initializing instance variables

    }



    public static void main(String[] args) {
        System.out.println(name); // C S

        System.out.println(tester1);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println( obj2.insVariable ); // 0

    }

}
