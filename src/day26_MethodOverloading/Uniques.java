package day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {
        String str = "AAABBBNJJJKKKUIII";
        String result = ""; // A

        for (int i=0; i<str.length(); i++){

            int num = Frequency(str,str.charAt(i));
            if (num == 1){
                result += str.charAt(i);
            }

        }
        System.out.println(result);



    }


    public static String Uniques(String str){

        String result = ""; // A

        for (int i=0; i<str.length(); i++){

            int num = Frequency(str,str.charAt(i));
            if (num == 1){
                result += str.charAt(i);
            }

        }
        return result;

    }



    public static int Frequency (String str, char ch){

        char[] arr = str.toCharArray();
        int count = 0;
        for(char each : arr){
            if (each == ch){
                count++;
            }

        }
        return count;
    }
}
