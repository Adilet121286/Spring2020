package day25_MethodsRecap;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "ABAB";
        String result = "";

        for (int i=0;i<str.length(); i++){

            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result += ch;
            }

        }
        System.out.println(result);

        String s1 = "asdasdasdl";
        String result2 = remomingStringDulicate(s1);
        System.out.println(result2);

    }
    public static String remomingStringDulicate(String string){

        String result = "";
        for (int i=0;i<string.length(); i++){

            char ch = string.charAt(i);
            if (!result.contains(""+ch)){
                result += ch;
            }

        }
        return result;



    }
}
