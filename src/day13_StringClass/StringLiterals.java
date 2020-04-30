package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {

        String str1 = "Cat"; // String Pool
        String str2 = new String("Cat");  // Java Heap

        System.out.println(str1 == str2); // two different objects

        String str3 = "Cat"; // String Pool
        System.out.println(str1 == str3); // two same objects

        String str4 = new String("Cat");
        System.out.println(str2 == str4); // false because two independed objects

        String s1 = "Java";     // it goes to String Pool, immutable we cannot modify it
        s1 = "JavaScript";

        System.out.println(s1);

        String s2 = "Java";     // no new object will be created in the memory.

        System.out.println(s1 == s2);       // false; "JavaScript" == "Java"

    }
}
