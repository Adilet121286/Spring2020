package day54_Maps;

public class String_VS_StringBuffer_VS_StringBulder {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1.concat("School");
        System.out.println(str1);


        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append("School");
        System.out.println(builder);

        System.out.println("==========================");
        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append("School");
        System.out.println(buffer);

        String string1 = "ABCD";

        StringBuilder sb = new StringBuilder(string1);
        System.out.println(sb.reverse());







    }



}
