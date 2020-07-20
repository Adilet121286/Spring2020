package Classes_Variables;

public class CodingBat {
    public static void main(String[] args) {

        System.out.println(missingChar1("code", 1));
    }

    public static String cat(String str, int i){
        return str = str.substring(0,i);


    }

    public String missingChar(String str, int n) {
        String a = str.substring(0,n);
        return a.concat(str.substring(n, str.length()-1));
    }
    public static String missingChar1(String str, int n) {
        return str.substring(str.length()).concat(str.substring(1,str.length()-1)).concat(str.substring(0,1));

    }

}
