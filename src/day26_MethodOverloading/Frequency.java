package day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {
        String str = "AAA";
        char ch = 'A';

        String string = "dddkkkdkdkdkddddd;;";
        int num1 = Frequency(string,'d');


        char[] arr = str.toCharArray();
        int count = 0;
        for(char each : arr){
            if (each == ch){
                count++;
            }
        }


        System.out.println(num1);
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
