package day14_SrtingClassContinue;

public class StringManipulation {
    public static void main(String[] args) {

        String str = "I Like ro J learn Java. I like to watch bthe movie Jumanji";

        int a1 = str.indexOf("J");

        System.out.println(a1);

        int a2 = str.indexOf("Jum");

        System.out.println(a2);

        String s = "I like Java, and I like reading";

                int b1 = s.lastIndexOf("I");

        System.out.println(b1);

        String z = "I like C#, C# is cool";
        int c1 = z.lastIndexOf("C");
        System.out.println(c1);

        String x = "I like Java, Java is fun, Java programming is fun";
        int x1 = x.indexOf("Java is fun,");
        System.out.println(x1);

        int d2 = x.indexOf("J");

        int d3 = x.lastIndexOf("J");
        System.out.println(d3);

        char ch1 = x.charAt(26);
        System.out.println(ch1);



    }
}
