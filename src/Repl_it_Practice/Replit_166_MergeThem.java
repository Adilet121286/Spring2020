package Repl_it_Practice;

public class Replit_166_MergeThem {
    public static void main(String[] args) {

    String one = "Adil";
    String two = "Ebi";

    String res = mergeStrings(one,two);
        System.out.println(res);

    }


    public static String mergeStrings(String one, String two) {
        String result="";
        for(int i=0;i<one.length() ||i <two.length(); i++){
            if(i<one.length()){
                result+=""+one.charAt(i);
            }if(i<two.length()){
                result+=""+two.charAt(i);
            }
        }
        return result;
    }

}
