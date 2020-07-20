package Review_Classes;

public class TaskFromGadu {
    public static void main(String[] args) {

        int num = 191818171;
        int sum = 0;

        while (num != 0)
        {
            sum += num % 10;
            num = num/10;
        }

        System.out.println(sum);


        int num2 = 191818171;
        int forSum;
        for (forSum = 0; num2 > 0; forSum += num2 % 10,num2 /= 10);

        System.out.println(forSum);
        System.out.println("===========================================");


        int num3 = 191818171;
        int doSum=0;

        do {
            doSum += num3%10;
            num3 = num3/10;

        }while (num3 !=0);

        System.out.println(doSum);
        System.out.println("===========================");

        String str1 = "10";
        String str2 = "20";
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
        System.out.println("=============================");


        // String s = "fred";  // use this if you want to test the exception below
        String s = "100";

        //try {

            int sumTry = Integer.parseInt(str1.trim())+Integer.parseInt(str2.trim())   ;
            System.out.println(sumTry);
       // }
       // catch (NumberFormatException nfe) {
         //   System.out.println("NumberFormatException: " + nfe.getMessage());
        //}


















    }



}
