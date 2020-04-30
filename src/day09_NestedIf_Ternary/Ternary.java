package day09_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if (num % 2==0){
            result="Even";
        }else {
            result="odd";
        }


        int num2 = 133;

        String result2 = (num2 % 2==0) ? "Even" : "Odd";
        System.out.println(result2);



        int num3 = 100;
        int num4 = 200;
        int max = 0;

        if (num3 > num4 ){
            max = num3;
        }else {
            max = num2;
        }


        int max2 = (num3 > num4) ? num3 : num4;

        System.out.println(max);
        System.out.println(max2);




    }
}
